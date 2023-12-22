package com.green.exproject.category.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "카테고리 목록 보기 VO")
public class CategorySelVo {
    private int categoryPk;
    private String categoryNm;
}
