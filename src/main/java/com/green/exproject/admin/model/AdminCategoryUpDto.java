package com.green.exproject.admin.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "(관리자)카테고리 목록 변경 DTO")
public class AdminCategoryUpDto {
    private int categoryPk;
    private String categoryNm;
}
