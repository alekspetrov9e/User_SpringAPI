package org.example.springapi.service;

import org.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<>();

        User user1 = new User(1,"a","a.mail.com","aa");
        User user2 = new User(2,"b","b.mail.com","bb");
        User user3 = new User(3,"c","c.mail.com","cc");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public User getUser(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
