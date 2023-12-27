package com.green.exproject.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "로그인 입력 정보")
public class UserSigninDto {
    @Schema(defaultValue = "아이디", description = "ddddd")
    private String uid;
    @Schema(defaultValue = "비밀번호")
    private String upw;

}
