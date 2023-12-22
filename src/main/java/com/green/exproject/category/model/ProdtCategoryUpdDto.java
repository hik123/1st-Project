package com.green.exproject.category.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "상품 카테고리 변경 DTO")
public class ProdtCategoryUpdDto {
    private int productPk;
    private int categoryPk;
}
