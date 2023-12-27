package com.green.exproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "구매예정 상품 리스트 입력정보")
@Data
public class ProductListSelDto {
    private int userPk;
    private int choiceList;
    /*
    @Schema(defaultValue = "0000-00-00")
    private String createdAt;
    @Schema(defaultValue = "0000-00-00")
    private String buyingDate;
     */
}
