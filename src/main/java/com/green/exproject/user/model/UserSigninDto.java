package com.green.exproject.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserSigninDto {
    @Schema(defaultValue = "아이디")
    private String uid;
    @Schema(defaultValue = "비밀번호")
    private String upw;

}
