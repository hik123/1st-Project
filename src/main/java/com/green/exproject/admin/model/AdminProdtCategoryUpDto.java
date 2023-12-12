package com.green.exproject.admin.model;

import lombok.Data;

import java.util.List;

@Data
public class AdminProdtCategoryUpDto {
    private List<Integer> productPk;
    private int categoryPk;
}
