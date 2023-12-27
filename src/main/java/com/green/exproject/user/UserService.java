package com.green.exproject.user;

import com.green.exproject.common.Const;
import com.green.exproject.common.ResVo;
import com.green.exproject.exception.ExceptionMessagePrint;
import com.green.exproject.user.model.UserSigninDto;
import com.green.exproject.user.model.UserSigninProcVo;
import com.green.exproject.user.model.UserSigninVo;
import com.green.exproject.user.model.UserSignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    // 회원가입 처리
    public ResVo postUser(UserSignupDto dto) {
        int result = mapper.insUser(dto);
        if(result == 0) {
            return new ResVo(Const.FAIL);
        }
        return new ResVo(dto.getUserPk());
    }

    // 로그인 인증
    /*
    public UserSigninVo getUserSignin (UserSigninDto dto) {
        UserSigninProcVo pVo = mapper.selUserSignin(dto.getUid());

        if(pVo == null) {
            throw new ExceptionMessagePrint("아이디를 확인 해주세요");
        } else if(!(dto.getUpw().equals(pVo.getUpw()))) {
            throw new ExceptionMessagePrint("비밀번호를 확인 해주세요");
        }
        return UserSigninVo.builder()
                .result(Const.SUCCESS) // result:1 로그인 성공
                .userPk(pVo.getUserPk())
                .nm(pVo.getNm())
                .build();
    } */
    public ResVo getUserSignin(UserSigninDto dto) {
        UserSigninProcVo pVo = mapper.selUserSignin(dto.getUid());
        if(pVo != null) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    // 예외처리를 위한 특정 userPk의 정보
    public UserSigninProcVo getUserPkInfo(int userPk) {
        UserSigninProcVo vo = mapper.selUserPkInfo(userPk);
        return vo;
    }

    // 회원가입 시 중복된 아이디 입력 예외처리
    public UserSigninProcVo getUserIdInfo(String uid) {
        return mapper.selUserSignin(uid);
    }
}
