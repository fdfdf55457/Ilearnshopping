package com.neuedu.controller.portal;

import com.neuedu.common.Const;
import com.neuedu.common.ServerResponse;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
@RestController
@RequestMapping(value = "/portal/user/")
public class UserInfoController {
    @Autowired
    IUserService iUserService;
    @RequestMapping(value = "register.do")
    public ServerResponse register(HttpSession session,UserInfo userInfo){
        return iUserService.register(userInfo);
    }
    @RequestMapping(value = "login.do")
    public ServerResponse login(HttpSession session,String username, String password){
        ServerResponse serverResponse=iUserService.login(username,password);
        if (serverResponse.isSuccess()){
            UserInfo userInfo=(UserInfo)serverResponse.getData();
            session.setAttribute(Const.CURRENTUSER,userInfo);
        }
        return serverResponse;
    }
}
