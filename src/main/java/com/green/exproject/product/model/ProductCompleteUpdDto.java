package com.green.exproject.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "구매확정 DTO")
public class ProductCompleteUpdDto {
    @Schema(defaultValue = "1")
    private int userPk;
    private int productPk;
}
