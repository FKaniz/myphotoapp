package com.example.myphotoapp.repository;

import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();
    public User getUser(){
        User user = new User(102349,"Tour-album","url","kaniz","Home",25);
        return user;
    }

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }
}

