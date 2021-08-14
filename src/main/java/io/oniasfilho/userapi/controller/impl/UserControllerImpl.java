package io.oniasfilho.userapi.controller.impl;

import io.oniasfilho.userapi.controller.UserController;
import io.oniasfilho.userapi.entity.User;
import io.oniasfilho.userapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserControllerImpl implements UserController {

    UserService service;

    public UserControllerImpl(UserService service) {
        this.service = service;
    }

    @GetMapping("/api/user")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
}
