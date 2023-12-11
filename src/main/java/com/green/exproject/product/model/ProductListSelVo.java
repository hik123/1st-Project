package com.green.exproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductListSelVo {
    private int productPk;
    private String categoryNm;

    @JsonIgnore
    @Schema(defaultValue = "1")
    private int userPk;

    private String productNm;
    private String memo;
    private int productCount;
    private String createdAt;
    private String updatedAt;
    private int buyingCheck;
    private String buyingDate;
}
