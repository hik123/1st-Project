package com.green.exproject.admin;

import com.green.exproject.admin.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<AdminCategorySelVo> selCategory();
    int insCategory(AdminCategoryInsDto dto);
    int updCategory(AdminCategoryUpdDto dto);
    int updProdtCategory(AdminProdtCategoryUpdDto dto);
    int insUser(AdminSignupDto dto);
    AdminSigninProcVo selUserSignin(String uid);
}
