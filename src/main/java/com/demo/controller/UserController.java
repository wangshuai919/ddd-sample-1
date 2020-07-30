package com.demo.controller;

import com.demo.controller.request.UserRequest;
import com.demo.domain.model.User;
import com.demo.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User register(@Validated @RequestBody UserRequest request) throws Exception {
        return userService.register(request);
    }
}
