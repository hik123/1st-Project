package com.green.exproject.category;


import com.green.exproject.category.model.*;
import com.green.exproject.common.Const;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryMapper mapper;

    // 카테고리 추가
    public ResVo postCategory(CategoryInsDto dto) {
        int result = mapper.insCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }


    // 카테고리 리스트 보기
    public List<CategorySelVo> getCategory() {
        return mapper.selCategory();
    }


    // 카테고리 이름 수정
    /*
    public ResVo patchCategory(AdminCategoryUpdDto dto) {
        int result = mapper.updCategory(dto);
        if(result == 1) {
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(Const.FAIL);
    }
    */


    // 상품의 카테고리PK 값 수정
    /*
    public ResVo putProdtCategory(AdminProdtCategoryUpdDto dto) {
        int result = mapper.updProdtCategory(dto);
        if(result > 0) {
            return new ResVo(result);
        }
        return new ResVo(Const.FAIL);
    }
    */
}
