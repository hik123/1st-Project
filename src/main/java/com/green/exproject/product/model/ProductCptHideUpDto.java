package com.green.exproject.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductCptHideUpDto {
    private int productPk;

    @Schema(defaultValue = "2", description = "디폴트 값 2: 구매완료 상품 숨김 처리")
    private int buyingCheck;



}
