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

    // 장바구니 목록 추가
    public ResVo postProduct(ProductListInsDto dto) {
        try {
            int result = mapper.insProduct(dto);
            if (result == 1) {
                return new ResVo(Const.SUCCESS);
            }
        } catch(Exception e) {

        }
        return new ResVo(Const.FAIL);
    }


    // 장바구니 목록 보기
    public List<ProductListSelVo> getProduct(ProductListSelDto dto) {
        return mapper.selProduct(dto);
    }


    // 장바구니 목록 수정
    public ResVo putProduct(ProductListUpdDto dto) {
        int result = mapper.updProduct(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    // 구매확정 처리
    public ResVo patchProductCheck(ProductCompleteUpdDto dto) {
        int result = mapper.updProductCheck(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }

    // 장바구니 물품 삭제 및 구매확정 물품 삭제(숨김) 처리
    public ResVo deleteProduct(ProductListDelDto dto) {
        int result = mapper.deleteProduct(dto);
        int result2 = mapper.updProductCptHide(dto);
        if(result == 0 && result2 == 0) {
            return new ResVo(Const.FAIL);
        }
        return new ResVo(result+result2);
    }
}
