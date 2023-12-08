package com.green.exproject.basket;


import com.green.exproject.basket.model.*;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {
    private final BasketMapper mapper;

    public ResVo postProduct(PurListInsDto dto) {
        int result = mapper.insProduct(dto);
        return new ResVo(result);
    }

    public List<PurListSelVo> postPurList(PurListSelDto dto){
        return mapper.selPurListAll(dto);
    }

    public ResVo putPurListAll(PurListUpDto dto) {
        int result = mapper.upPurListAll(dto);
        return new ResVo(result);
    }

    public ResVo deleteProduct(PurListDelDto dto) {
        int result = mapper.deleteProduct(dto);
        return new ResVo(result);
    }
}
