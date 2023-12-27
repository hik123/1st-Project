package com.green.exproject.user.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "회원가입 입력정보")
public class UserSignupDto {
    @JsonIgnore
    private int userPk;

    private String uid;
    private String upw;
    private String nm;
}
