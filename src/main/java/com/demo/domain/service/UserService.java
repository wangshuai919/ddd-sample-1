package com.demo.domain.service;

import com.demo.controller.request.UserRequest;
import com.demo.domain.model.User;
import com.demo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User register(UserRequest request) throws Exception {
        User user = transfer(request);
        return userRepository.save(user);
    }

    private User transfer(UserRequest request) {
        return User.builder()
                    .type(request.getType())
                    .companyName(request.getCompanyName())
                    .companyCode(request.getCompanyCode())
                    .name(request.getName())
                    .idType(request.getIdType())
                    .idCode(request.getIdCode())
                    .build();
    }
}
