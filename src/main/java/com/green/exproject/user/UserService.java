package com.green.exproject.user;

import com.green.exproject.common.Const;
import com.green.exproject.common.ResVo;
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
    public UserSigninVo getUserSignin (UserSigninDto dto) {
        UserSigninProcVo pVo = mapper.selUserSignin(dto.getUid());

        if(pVo == null) {
            return UserSigninVo.builder().result(Const.LOGIN_NO_UID).build(); // result:2 없는 아이디
        } else if(!(dto.getUpw().equals(pVo.getUpw()))) {
            return UserSigninVo.builder().result(Const.LOGIN_DIFF_UPW).build(); // result:3 비밀번호 틀림
        }
        return UserSigninVo.builder()
                .result(Const.SUCCESS) // result:1 로그인 성공
                .userPk(pVo.getUserPk())
                .nm(pVo.getNm())
                .build();
    }
}
