package org.happybaras.parcial2.services.impls;

import jakarta.transaction.Transactional;
import org.happybaras.parcial2.domain.dtos.UserRegisterDTO;
import org.happybaras.parcial2.domain.entities.Role;
import org.happybaras.parcial2.domain.entities.Token;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.repositories.RoleRepository;
import org.happybaras.parcial2.repositories.TokenRepository;
import org.happybaras.parcial2.repositories.UserRepository;
import org.happybaras.parcial2.services.UserService;
import org.happybaras.parcial2.utils.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final JWTTools jwtTools;
    private final PasswordEncoder passwordEncoder;
    private final TokenRepository tokenRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, TokenRepository tokenRepository, PasswordEncoder passwordEncoder, JWTTools jwtTools) {
        this.roleRepository = roleRepository;
        this.jwtTools = jwtTools;
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Token registerToken(User user) throws Exception {
        cleanTokens(user);

        String tokenString = jwtTools.generateToken(user);
        Token token = new Token(tokenString, user);

        tokenRepository.save(token);
        return token;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Boolean isTokenValid(User user, String token) {
        try {
            cleanTokens(user);
            List<Token> tokens = tokenRepository.findByUserAndActive(user, true);

            tokens.stream()
                    .filter(tk -> tk.getContent().equals(token))
                    .findAny()
                    .orElseThrow(Exception::new);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void cleanTokens(User user) throws Exception {
        List<Token> tokens = tokenRepository.findByUserAndActive(user, true);

        tokens.forEach(token -> {
            if (!jwtTools.verifyToken(token.getContent())) {
                token.setActive(false);
                tokenRepository.save(token);
            }
        });
    }

    @Override
    public User findUserAuthenticated() throws Exception {
        String identifier = SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();

        return userRepository.findByUsernameOrEmail(identifier, identifier)
                .orElse(null);
    }

    @Override
    public User findOneByIdentifier(String identifier) {
        return userRepository.findByUsernameOrEmail(identifier, identifier)
                .orElse(null);
    }

    @Override
    public User findByUsernameOrEmail(UserRegisterDTO info) {
        return userRepository.findByUsernameOrEmail(info.getUsername(), info.getEmail())
                .orElse(null);
    }

    @Override
    public boolean checkPassword(User user, String password) {
        return passwordEncoder.matches(password, user.getPassword());
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void createUser(UserRegisterDTO info) {
        User user = new User();

        user.setUsername(info.getUsername());
        user.setEmail(info.getEmail());
        String encryptedPassword = passwordEncoder.encode(info.getPassword());
        user.setPassword(encryptedPassword);

        userRepository.save(user);
    }

    @Override
    public void changeRoles(User user, List<String> roles) {
        List<Role> rolesFound = roleRepository.findAllById(roles);
        user.setRoles(rolesFound);

        userRepository.save(user);
    }
}
