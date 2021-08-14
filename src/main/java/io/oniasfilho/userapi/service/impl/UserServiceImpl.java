package io.oniasfilho.userapi.service.impl;

import io.oniasfilho.userapi.entity.User;
import io.oniasfilho.userapi.repository.UserRepository;
import io.oniasfilho.userapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> todosUsers = new ArrayList<>();

        //mesma merda que fazer um for(User i: repository.findAll())
        repository.findAll().forEach(todosUsers::add);

        return todosUsers;
    }
}
