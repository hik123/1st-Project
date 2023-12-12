package com.green.exproject.product;


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
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public List<ProductListSelVo> getProduct(ProductListSelDto dto) {
        return mapper.selProduct(dto);
    }

    public ResVo putProduct(ProductListUpDto dto) {
        int result = mapper.upProduct(dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public ResVo patchProductCheck(ProductCompleteUpDto dto) {
        int result = mapper.upProductCheck(dto);
        if(result == 1) {
            return new ResVo(1);
        }

        return new ResVo(0);
    }

    public ResVo patchProductCptHide(ProductCptHideUpDto dto) {
        int result = mapper.upProductCptHide(dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public ResVo deleteProduct(ProductListDelDto dto) {
        int result = mapper.deleteProduct(dto);
        if(result > 0) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

}
