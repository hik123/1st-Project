package com.green.exproject.admin.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AdminCategorySelDto {
    @Schema(defaultValue = "1")
    private int isCategory;
}
