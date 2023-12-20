package com.green.exproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "구매예정 상품 리스트 DTO")
@Data
public class ProductListSelDto {
    @Schema(defaultValue = "1", description = "디폴트 유저PK 값: 1(수정X)")
    private int userPk;
    @Schema(defaultValue = "0", description = "isList 값이 0:모든목록, 1:구매 할 목록, 2:구매 완료목록")
    private int choiceList;
    /*
    @Schema(defaultValue = "0000-00-00")
    private String createdAt;
    @Schema(defaultValue = "0000-00-00")
    private String buyingDate;
     */
}
