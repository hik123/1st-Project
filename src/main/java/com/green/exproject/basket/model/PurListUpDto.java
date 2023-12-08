package com.green.exproject.basket.model;


import lombok.Data;

@Data
public class PurListUpDto {
    private int productPk;
    private int categoryPk;
    private String productNm;
    private String memo;
    private int productCount;
}
