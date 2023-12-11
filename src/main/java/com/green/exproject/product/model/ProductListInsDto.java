package com.green.exproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductListInsDto {
    @JsonIgnore
    private int productPk;

    @Schema(defaultValue = "1")
    private int userPk;

    private int categoryPk;
    private String productNm;
    private String memo;

    // private int productCount;
}
