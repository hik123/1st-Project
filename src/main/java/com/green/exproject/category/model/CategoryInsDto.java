package com.green.exproject.category.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "카테고리 추가 입력정보")
public class CategoryInsDto {
    @JsonIgnore
    private int categoryPk;
    @Schema(defaultValue = "카테고리 이름")
    private String categoryNm;
}
