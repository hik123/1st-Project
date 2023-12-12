package com.green.exproject.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "구매확정 상품 삭제 DTO")
public class ProductCptHideUpDto {
    private List<Integer> productPk;
}
