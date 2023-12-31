package com.green.exproject.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "구매 확정 상품 삭제 입력정보")
public class ProductCptHideUpdDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
}
