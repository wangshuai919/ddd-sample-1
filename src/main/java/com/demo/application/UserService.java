package com.demo.application;

import com.demo.domain.user.User;
import com.demo.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User register(User user) throws Exception {
        user.registry();
        return userRepository.save(user);
    }

}
