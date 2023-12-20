package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
import com.green.exproject.common.Const;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper mapper;

    // 카테고리 추가
    public ResVo postCategory(AdminCategoryInsDto dto) {
        int result = mapper.insCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }


    // 카테고리 리스트 보기
    public List<AdminCategorySelVo> getCategory() {
        return mapper.selCategory();
    }


    // 카테고리 이름 수정
    public ResVo patchCategory(AdminCategoryUpdDto dto) {
        int result = mapper.updCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }


    // 상품의 카테고리PK 값 수정
    public ResVo putProdtCategory(AdminProdtCategoryUpdDto dto) {
        int result = mapper.updProdtCategory(dto);
        if(result > 0) {
            return new ResVo(result);
        }
        return new ResVo(Const.FAIL);
    }


    // 회원가입 처리
    public ResVo postUser(AdminSignupDto dto) {
        int result = mapper.insUser(dto);
        if(result == 0) {
            return new ResVo(Const.FAIL);
        }
        return new ResVo(dto.getUserPk());
    }

    // 로그인 인증
    public AdminSigninVo getUserSignin (AdminSigninDto dto) {
        AdminSigninProcVo pVo = mapper.selUserSignin(dto.getUid());

        if(pVo == null) {
            return AdminSigninVo.builder().result(Const.LOGIN_NO_UID).build(); // result:2 없는 아이디
        } else if(!(dto.getUpw().equals(pVo.getUpw()))) {
            return AdminSigninVo.builder().result(Const.LOGIN_DIFF_UPW).build(); // result:3 비밀번호 틀림
        }
        return AdminSigninVo.builder()
                .result(Const.SUCCESS) // result:1 로그인 성공
                .userPk(pVo.getUserPk())
                .nm(pVo.getNm())
                .build();
    }

}
