package com.green.exproject.user;


import com.green.exproject.user.model.UserSigninProcVo;
import com.green.exproject.user.model.UserSignupDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignupDto dto);
    UserSigninProcVo selUserSignin(String uid);

    UserSigninProcVo selUserPkInfo(int userPk);
}
