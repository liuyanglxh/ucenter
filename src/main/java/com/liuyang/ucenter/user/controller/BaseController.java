package com.liuyang.ucenter.user.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;

}
