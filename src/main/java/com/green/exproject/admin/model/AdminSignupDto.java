package com.green.exproject.admin.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "회원가입 DTO")
public class AdminSignupDto {
    @JsonIgnore
    private int userPk;

    private String uid;
    private String upw;
    private String nm;
}
