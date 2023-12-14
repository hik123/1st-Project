package com.green.exproject.admin;

import com.green.exproject.admin.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<AdminCategorySelVo> selCategory(int isCategory);
    int insCategory(AdminCategoryInsDto dto);
    int upCategory(AdminCategoryUpDto dto);

    int upProdtCategory(AdminProdtCategoryUpDto dto);
    int insUser(AdminSignupDto dto);

    AdminUserEntity selUserSignin(AdminUserSelDto dto);
}
