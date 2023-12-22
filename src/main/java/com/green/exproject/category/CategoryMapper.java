package com.green.exproject.category;

import com.green.exproject.category.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategorySelVo> selCategory();
    int insCategory(CategoryInsDto dto);

    //int updCategory(AdminCategoryUpdDto dto);

    //int updProdtCategory(AdminProdtCategoryUpdDto dto);
}
