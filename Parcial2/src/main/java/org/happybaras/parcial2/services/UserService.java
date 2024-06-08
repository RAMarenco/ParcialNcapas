package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.dtos.UserRegisterDTO;
import org.happybaras.parcial2.domain.entities.Token;
import org.happybaras.parcial2.domain.entities.User;

import java.util.List;

public interface UserService {
    // Token management
    Token registerToken(User user) throws Exception;
    Boolean isTokenValid(User user, String token);
    void cleanTokens(User user) throws Exception;

    // User management
    User findUserAuthenticated() throws Exception;
    User findOneByIdentifier(String identifier);
    User findByUsernameOrEmail(UserRegisterDTO info);
    boolean checkPassword(User user, String password);
    void createUser(UserRegisterDTO info);
    void changeRoles(User user, List<String> roles);
}
