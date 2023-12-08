package com.green.exproject.basket.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class PurListInsDto {
    @JsonIgnore
    private int productPk;
    @JsonIgnore
    private int userPk = 1;

    private int categoryPk;
    private String productNm;
    private String memo;
    private int productCount;
}
