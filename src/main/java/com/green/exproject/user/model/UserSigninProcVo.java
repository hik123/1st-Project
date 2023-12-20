package com.green.exproject.user.model;


import lombok.Data;

@Data
public class UserSigninProcVo {
    private int userPk;
    private String upw;
    private String nm;
    private String createdAt;
}

