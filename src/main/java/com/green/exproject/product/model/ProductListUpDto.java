package com.green.exproject.product.model;


import lombok.Data;

@Data
public class ProductListUpDto {
    private int productPk;
    private int categoryPk;
    private String productNm;
    private String memo;
    //private int productCount;
}
