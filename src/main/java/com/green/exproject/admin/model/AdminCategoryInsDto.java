package com.green.exproject.admin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class AdminCategoryInsDto {
    @JsonIgnore
    private int categoryPk;
    private String categoryNm;
}
