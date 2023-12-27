package com.green.exproject.user;

import com.green.exproject.category.CategoryService;
import com.green.exproject.common.ResVo;
import com.green.exproject.exception.ExceptionMessagePrint;
import com.green.exproject.user.model.UserSigninDto;
import com.green.exproject.user.model.UserSigninProcVo;
import com.green.exproject.user.model.UserSigninVo;
import com.green.exproject.user.model.UserSignupDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@Tag(name = "유저")
public class UserController {
    private final UserService service;
    private final CategoryService adminService;

    @Operation(summary = "회원가입")
    @PostMapping("/signup")
    public ResVo postUser(@RequestBody UserSignupDto dto) {
        if(dto.getUid() == "" || dto.getUid() == null) {
            throw new ExceptionMessagePrint("아이디를 입력 해주세요.");
        }

        UserSigninProcVo vo = service.getUserIdInfo(dto.getUid());
        if(vo != null) {
            throw new ExceptionMessagePrint("중복된 아이디 입니다.");
        }

        if(dto.getUpw() == "" || dto.getUpw() == null) {
            throw new ExceptionMessagePrint("비밀번호를 입력 해주세요.");
        }

        if(dto.getNm() == "" || dto.getNm() == null) {
            throw new ExceptionMessagePrint("이름을 입력 해주세요.");
        }

        return service.postUser(dto);
    }

    @Operation(summary = "로그인", description = "result값 <br>1: 로그인 성공 <br>2: 비밀번호 틀림 <br>3: 없는 아이디")
    @PostMapping("/signin")
    public ResVo getUserSignin(@RequestBody UserSigninDto dto) {
        log.info("dto : {}", dto);
        return service.getUserSignin(dto);
    }
}
