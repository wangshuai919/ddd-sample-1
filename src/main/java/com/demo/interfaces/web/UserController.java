package com.demo.interfaces.web;

import com.demo.domain.user.User;
import com.demo.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User register(@Valid @RequestBody UserRequest request) throws Exception {
        User user = transfer(request);
        return userService.register(user);
    }

    private User transfer(UserRequest request) {
        return User.builder()
                .phoneNo(request.getPhoneNo())
                .password(request.getPassword())
                .realName(request.getRealName())
                .idType(request.getIdType())
                .idCode(request.getIdCode())
                .build();
    }
}
