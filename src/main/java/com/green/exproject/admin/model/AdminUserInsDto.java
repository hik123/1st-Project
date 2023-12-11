package com.green.exproject.admin.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "(관리자)유저추가 DTO")
public class AdminUserInsDto {
    @JsonIgnore
    private int userPk;

    private String uid;
    private String upw;
    private String nm;
}
