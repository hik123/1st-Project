package com.green.exproject.product.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "상품 수정 DTO")
public class ProductListUpdDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
    @Schema(defaultValue = "3")
    private int categoryPk;
    @Schema(defaultValue = "상품 이름")
    private String productNm;
    @Schema(defaultValue = "메모")
    private String memo;
}
