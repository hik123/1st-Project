package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
import com.green.exproject.common.Const;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
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
    public List<AdminCategorySelVo> getCategory(AdminCategorySelDto dto) {
        return mapper.selCategory(dto.getIsCategory());
    }


    // 카테고리 이름 수정
    public ResVo patchCategory(AdminCategoryUpDto dto) {
        int result = mapper.upCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }


    // 상품의 카테고리PK 값 수정
    public ResVo putProdtCategory(AdminProdtCategoryUpDto dto) {
        int result = mapper.upProdtCategory(dto);
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
        AdminUserSelDto sDto = new AdminUserSelDto();
        sDto.setUid(dto.getUid());

        AdminUserEntity entity = mapper.selUserSignin(sDto);

        if(entity == null) {
            return AdminSigninVo.builder().result(Const.LOGIN_NO_UID).build(); // result:2 없는 아이디
        } else if(!(dto.getUpw().equals(entity.getUpw()))) {
            return AdminSigninVo.builder().result(Const.LOGIN_DIFF_UPW).build(); // result:3 비밀번호 틀림
        }
        return AdminSigninVo.builder()
                .result(Const.SUCCESS) // result:1 로그인 성공
                .userPk(entity.getUserPk())
                .nm(entity.getNm())
                .build();
    }

}
