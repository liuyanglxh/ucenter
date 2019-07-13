package com.liuyang.ucenter.user.service.impl;

import com.liuyang.ucenter.user.pojo.entity.UserEntity;
import com.liuyang.ucenter.user.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class UserServiceImpl implements UserService {


    @Value("${default.user.id}")
    private Integer defaultUserId;

    @Override
    public UserEntity get(Integer id) {
        id = id == null ? defaultUserId : id;
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setAge(10);
        userEntity.setName("user--" + id);
        return userEntity;
    }
}
