package com.green.exproject.admin.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdminUserEntity {
    private int userPk;
    private String uid;
    private String upw;
    private String nm;
    private String createdAt;
}

