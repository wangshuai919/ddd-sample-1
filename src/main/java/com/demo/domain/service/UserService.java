package com.demo.domain.service;

import com.demo.domain.model.User;
import com.demo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User register(User user) throws Exception {
        return userRepository.save(user);
    }

}
