package com.green.exproject.product.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "상품 수정 DTO")
public class ProductListUpdDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
    private int categoryPk;
    private String productNm;
    private String memo;
}
