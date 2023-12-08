package com.green.exproject.basket;


import com.green.exproject.basket.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasketMapper {
    int insProduct(PurListInsDto dto);

    List<PurListSelVo> selPurListAll(PurListSelDto dto);

    int upPurListAll(PurListUpDto dto);

    int deleteProduct(PurListDelDto dto);
}
