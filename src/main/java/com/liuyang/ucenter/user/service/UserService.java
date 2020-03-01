package com.liuyang.ucenter.user.service;


import com.liuyang.ucenter.user.pojo.entity.UserEntity;
import com.liuyang.ucenter.user.pojo.view.UserView;

public interface UserService {

    UserEntity get(Integer id);

    /**
     * 根据id获取用户view信息
     * @param userId
     * @return
     */
    UserView getView(Integer userId);
}
