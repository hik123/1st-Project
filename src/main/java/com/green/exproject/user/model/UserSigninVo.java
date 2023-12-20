package com.green.exproject.user.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserSigninVo {
    private int result;
    private int userPk;
    private String nm;
}
