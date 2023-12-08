package com.green.exproject.admin.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class AdminUserInsDto {
    @JsonIgnore
    private int userPk;

    private String uid;
    private String upw;
    private String nm;
}
