package com.green.exproject.user.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "회원가입 DTO")
public class UserSignupDto {
    @JsonIgnore
    private int userPk;
    @Schema(defaultValue = "아이디")
    private String uid;
    @Schema(defaultValue = "비밀번호")
    private String upw;
    @Schema(defaultValue = "이름")
    private String nm;
}
