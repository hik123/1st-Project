package com.green.exproject.admin;


import com.green.exproject.admin.model.AdminCategoryInsDto;
import com.green.exproject.admin.model.AdminUserInsDto;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper mapper;

    public ResVo postCategory(AdminCategoryInsDto dto) {
        int result = mapper.insCategory(dto);
        return new ResVo(result);
    }

    public ResVo postUser(AdminUserInsDto dto) {
        int result = mapper.insUser(dto);
        return new ResVo(result);
    }
}
