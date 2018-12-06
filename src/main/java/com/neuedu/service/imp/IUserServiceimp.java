package com.neuedu.service.imp;

import com.neuedu.common.Const;
import com.neuedu.common.ServerResponse;
import com.neuedu.dao.UserInfoMapper;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IUserServiceimp implements IUserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public ServerResponse register(UserInfo userInfo) {
        //参数非空校验
        if (userInfo==null){
            return ServerResponse.serverResponseByError("信息不能为空");
        }
        //校验用户名是否存在
        int i=userInfoMapper.checkUsername(userInfo.getUsername());
        if (i>0){
            return ServerResponse.serverResponseByError("用户已经存在");
        }
        //校验邮箱是否存在
        int i_email=userInfoMapper.checkEmail(userInfo.getEmail());
        if (i_email>0){
            return ServerResponse.serverResponseByError("邮箱已经被注册");
        }
        //注册
        userInfo.setRole(Const.RoleEnum.ROLE_CUSTOMER.getCode());
        int count =userInfoMapper.insert(userInfo);
        if (count>0){
            return ServerResponse.serverResponseBySuccess("注册成功");
        }
        //对结果的处理并返回

        return ServerResponse.serverResponseByError("注册失败");
    }

    @Override
    public ServerResponse login(String username, String password) {
        //参数非空校验
        if (StringUtils.isBlank(username)){
            return ServerResponse.serverResponseByError("用户名不能为空");
        }
        if (StringUtils.isBlank(password)){
            return ServerResponse.serverResponseByError("密码不能为空");
        }
        //验证username是否存在
        int i=userInfoMapper.checkUsername(username);
        if (i<=0){
            return ServerResponse.serverResponseByError("用户不存在");
        }
        //根据用户名查找
       UserInfo userInfo=userInfoMapper.selectByUsernameAndPassword(username,password);
        if (userInfo==null){
            return ServerResponse.serverResponseByError("密码错误");
        }
        //结果处理并返回
        userInfo.setPassword("");//把密码置空

        return ServerResponse.serverResponseBySuccess(userInfo,null);
    }
}
