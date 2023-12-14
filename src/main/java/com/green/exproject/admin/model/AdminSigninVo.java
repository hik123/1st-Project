package com.green.exproject.admin.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AdminSigninVo {
    private int result;
    private int userPk;
    private String nm;
}
