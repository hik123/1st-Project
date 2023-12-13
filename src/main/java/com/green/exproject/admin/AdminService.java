package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
import com.green.exproject.common.Const;
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
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    public List<AdminCategorySelVo> getCategory(AdminCategorySelDto dto) {
        return mapper.selCategory(dto.getIsCategory());
    }
    public ResVo patchCategory(AdminCategoryUpDto dto) {
        int result = mapper.upCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }



    public ResVo putProdtCategory(AdminProdtCategoryUpDto dto) {
        int result = mapper.upProdtCategory(dto);
        if(result > 0) {
            return new ResVo(result);
        }
        return new ResVo(Const.FAIL);
    }


    //회원가입 처리
    public ResVo postUser(AdminSignupDto dto) {
        int result = mapper.insUser(dto);
        if(result == 0) {
            return new ResVo(Const.FAIL);
        }
        return new ResVo(dto.getUserPk());
    }

    //로그인

}
