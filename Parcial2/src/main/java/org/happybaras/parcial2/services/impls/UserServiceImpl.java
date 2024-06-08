package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.dtos.UserRegisterDTO;
import org.happybaras.parcial2.domain.entities.Token;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.services.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public Token registerToken(User user) throws Exception {
        return null;
    }

    @Override
    public Boolean isTokenValid(User user, String token) {
        return null;
    }

    @Override
    public void cleanTokens(User user) throws Exception {

    }

    @Override
    public User findUserAuthenticated() throws Exception {
        return null;
    }

    @Override
    public User findOneByIdentifier(String identifier) {
        return null;
    }

    @Override
    public User findByUsernameOrEmail(UserRegisterDTO info) {
        return null;
    }

    @Override
    public boolean checkPassword(User user, String password) {
        return false;
    }

    @Override
    public void createUser(UserRegisterDTO info) {

    }
}
