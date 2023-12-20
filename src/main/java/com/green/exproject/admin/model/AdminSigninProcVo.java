package com.green.exproject.admin.model;


import lombok.Data;

@Data
public class AdminSigninProcVo {
    private int userPk;
    private String upw;
    private String nm;
    private String createdAt;
}

