package com.liuyang.ucenter.user.controller.client;

import com.liuyang.ucenter.user.controller.BaseController;
import com.liuyang.ucenter.user.pojo.Result;
import com.liuyang.ucenter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/user/v1")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    @GetMapping("info")
    public Result getUserInfo(@RequestParam(value = "id", required = false) Integer id) {
        return Result.success(userService.get(id));
    }

}
