package com.neuedu.service;

import com.neuedu.common.ServerResponse;
import com.neuedu.pojo.UserInfo;

public interface IUserService {
    public ServerResponse register(UserInfo userInfo);
    public ServerResponse login(String username,String password);

}
