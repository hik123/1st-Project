package com.green.exproject.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "상품 구매 확정, 취소 입력정보")
public class ProductCompleteUpdDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
}
