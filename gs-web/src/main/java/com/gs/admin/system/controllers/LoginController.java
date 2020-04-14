package com.gs.admin.system.controllers;

import com.gs.admin.system.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: gs
 * @description: 登陆controller
 * @author: Gu
 * @create: 2020-04-14 13:45
 **/
@RestController
@RequestMapping("admin")
public class LoginController {


    @Autowired
    ILoginService loginService;

    @GetMapping("login")
    public String login() {
        String result = loginService.Login("");
        return result;
    }


}
