package com.green.exproject.category.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "카테고리 목록 변경 DTO")
public class CategoryUpdDto {
    private int categoryPk;
    @Schema(defaultValue = "카테고리 이름")
    private String categoryNm;
}
