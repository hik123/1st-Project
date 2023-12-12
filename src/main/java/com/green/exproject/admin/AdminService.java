package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper mapper;

    public ResVo postCategory(AdminCategoryInsDto dto) {
        int result = mapper.insCategory(dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public List<AdminCategorySelVo> getCategory(AdminCategorySelDto dto) {
        return mapper.selCategory(dto.getIsCategory());
    }
    public ResVo patchCategory(AdminCategoryUpDto dto) {
        int result = mapper.upCategory(dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public ResVo putProdtCategory(AdminProdtCategoryUpDto dto) {
        int result = mapper.upProdtCategory(dto);
        if(result > 0) {
            return new ResVo(result);
        }
        return new ResVo(0);
    }

    public ResVo postUser(AdminUserInsDto dto) {
        int result = mapper.insUser(dto);
        return new ResVo(result);
    }
}
