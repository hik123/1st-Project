package com.green.exproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "구매예정 상품 리스트 VO")
public class ProductListSelVo {
    private int productPk;
    private String categoryNm;
    private int userPk;
    private String productNm;
    private String memo;
    private int productCount;
    private String createdAt;
    private String updatedAt;
    private int buyingCheck;
    private String buyingDate;
}
