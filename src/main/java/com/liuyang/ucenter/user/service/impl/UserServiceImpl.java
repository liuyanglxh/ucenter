package com.liuyang.ucenter.user.service.impl;

import com.liuyang.ucenter.user.pojo.Result;
import com.liuyang.ucenter.user.pojo.entity.UserEntity;
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
        id = id == null ? defaultUserId : id;
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setAge(10);
        Result<String> biz = businessService.getBusinessByUser(id);
        String name = "";
        if (biz != null) {
            name = biz.getData();
        }
        userEntity.setName("user--" + id + ":" + name);

        return userEntity;
    }
}
