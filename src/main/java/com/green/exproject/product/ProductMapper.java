package com.green.exproject.product;


import com.green.exproject.product.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insProduct(ProductListInsDto dto);

    List<ProductListSelVo> selProduct(ProductListSelDto dto);

    int updProduct(ProductListUpDto dto);

    int updProductCheck(ProductCompleteUpDto dto);

    int updProductCptHide(ProductListDelDto dto);

    int deleteProduct(ProductListDelDto dto);
}
