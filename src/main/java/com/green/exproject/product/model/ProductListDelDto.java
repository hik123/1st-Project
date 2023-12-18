package com.green.exproject.product.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "구매예정 상품 삭제 DTO")
public class ProductListDelDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
}
