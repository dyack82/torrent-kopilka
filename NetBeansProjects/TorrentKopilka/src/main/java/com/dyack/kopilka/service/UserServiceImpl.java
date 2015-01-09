package com.dyack.kopilka.service;

import com.dyack.kopilka.entity.UserDEVCOLIBRI;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDEVCOLIBRI getUser(String login) {
        UserDEVCOLIBRI user = new UserDEVCOLIBRI();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

}
