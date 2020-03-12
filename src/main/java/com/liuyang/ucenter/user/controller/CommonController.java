package com.liuyang.ucenter.user.controller;

import com.liuyang.ucenter.user.pojo.Result;
import com.liuyang.ucenter.user.rpc.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/user/v1")
public class CommonController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("init-hystrix")
    public Result initHystrix(){
        Result<String> s = businessService.getBusinessByUser(1);
        return Result.success(s);
    }

}
