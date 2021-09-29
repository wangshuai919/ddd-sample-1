package com.demo.infrastructure.user;

import com.demo.domain.user.User;
import com.demo.domain.user.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> userList = new ArrayList<>();

    @Resource
    UserMapper userMapper;

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntity.builder()
                .phoneNo(user.getPhoneNo())
                .realName(user.getRealName())
                .idCode(user.getIdCode())
                .idType(user.getIdType()).build();
        userMapper.insert(userEntity);
        user.setId(userEntity.getId());
        return user;
    }
}
