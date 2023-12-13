package com.green.exproject.product;


import com.green.exproject.common.Const;
import com.green.exproject.product.model.*;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper mapper;

    public ResVo postProduct(ProductListInsDto dto) {
        int result = mapper.insProduct(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    public List<ProductListSelVo> getProduct(ProductListSelDto dto) {
        return mapper.selProduct(dto);
    }

    public ResVo putProduct(ProductListUpDto dto) {
        int result = mapper.updProduct(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    public ResVo patchProductCheck(ProductCompleteUpDto dto) {
        int result = mapper.updProductCheck(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    public ResVo deleteProduct(ProductListDelDto dto) {
        int result = mapper.deleteProduct(dto);
        int result2 = mapper.updProductCptHide(dto);
        if(result == 0 || result2 == 0) {
            return new ResVo(Const.FAIL);
        }
        return new ResVo(Const.SUCCESS);
    }

}
