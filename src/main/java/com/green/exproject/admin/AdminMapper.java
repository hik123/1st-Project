package com.green.exproject.admin;

import com.green.exproject.admin.model.AdminCategoryInsDto;
import com.green.exproject.admin.model.AdminUserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    int insCategory(AdminCategoryInsDto dto);

    int insUser(AdminUserInsDto dto);
}
