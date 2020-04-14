package com.gs.admin.system.service;

import org.springframework.stereotype.Service;

/**
 * @program: gs
 * @description: 登陆接口
 * @author: Gu
 * @create: 2020-04-14 10:36
 **/
public interface ILoginService {

    /**
    * @Description: 登陆函数
    * @Param:  JSON格式的参数
    * @return:  JSON格式的string字符串
    * @Author: Gu
    * @Date: 2020-4-14
    */
    String Login(String parms);

}
