package com.liuyang.ucenter.user.pojo.view;

import com.liuyang.ucenter.user.pojo.entity.CityEntity;
import com.liuyang.ucenter.user.pojo.entity.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserView extends UserEntity {

    private CityEntity city;
    /**
     * 用户的奖章
     */
    private List<Medal> medals;
    /**
     * 角色
     */
    private List<Role> roles;
    /**
     * 账户
     */
    private List<Account> accounts;
}


class Medal {

}

class Role{

}

class Account {

}

class Permission{

}