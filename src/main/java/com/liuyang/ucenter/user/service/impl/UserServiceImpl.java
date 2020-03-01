package com.liuyang.ucenter.user.service.impl;

import com.liuyang.ucenter.user.pojo.entity.UserEntity;
import com.liuyang.ucenter.user.pojo.view.UserView;
import com.liuyang.ucenter.user.rpc.BusinessService;
import com.liuyang.ucenter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class UserServiceImpl implements UserService {


    //    @Value("${default.user.id}")
    private Integer defaultUserId = 1;

    @Autowired
    private BusinessService businessService;

    @Override
    public UserEntity get(Integer id) {
        if (id == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setAge(10);
        userEntity.setName(String.format("name is %d", id));

        return userEntity;
    }

    @Override
    public UserView getView(Integer userId) {
        return null;
    }
}
