package com.gs.admin.system.service.impl;

import com.gs.admin.system.dto.SysUser;
import com.gs.admin.system.dto.SysUserKey;
import com.gs.admin.system.mapper.SysUserMapper;
import com.gs.admin.system.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: gs
 * @description:
 * @author: Gu
 * @create: 2020-04-14 10:42
 **/
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public String Login(String parms) {

        SysUserKey key = new SysUserKey();
        key.setUserid("000001");
        key.setId(3);
        SysUser user = new SysUser();
        user = sysUserMapper.selectByPrimaryKey(key);

        return user.getUserid()+user.getUsername()+user.getPassword();
    }
}
