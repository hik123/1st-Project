package com.green.exproject.basket.model;

import lombok.Data;

@Data
public class PurListSelVo {
    private int productPk;
    private int userPk = 1;
    private int categoryPk;
    private String productNm;
    private String memo;
    private int productCount;
    private String createdAt;
    private String updatedAt;
    private int buyingCheck;
    private String buyingDate;
}
