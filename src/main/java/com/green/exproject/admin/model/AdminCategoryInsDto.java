package com.green.exproject.admin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "(관리자)카테고리 추가 DTO")
public class AdminCategoryInsDto {
    @JsonIgnore
    private int categoryPk;
    private String categoryNm;
}
