package com.green.exproject.category;


import com.green.exproject.category.model.*;
import com.green.exproject.common.ResVo;
import com.green.exproject.product.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@Tag(name = "카테고리")
public class CategoryController {
    private final CategoryService service;
    private final CategoryService adminService;
    private final ProductService productService;

    @Operation(summary = "카테고리 추가", description = "카테고리 종류 추가")
    @PostMapping
    public ResVo postCategory(@RequestBody CategoryInsDto dto) {
        return service.postCategory(dto);
    }

    @Operation(summary = "카테고리 리스트", description = "전체 카테고리 리스트 보기 ")
    @GetMapping
    public List<CategorySelVo> getCategory() {
        return service.getCategory();
    }


    /*
    @Operation(summary = "카테고리 수정", description = "카테고리 종류 수정")
    @PatchMapping
    public ResVo patchCategory(@RequestBody AdminCategoryUpdDto dto) {
        List<AdminCategorySelVo> category = adminService.getCategory();
        if(dto.getCategoryPk() < 1 || dto.getCategoryPk() > category.size()) {
            throw new ExceptionCategoryPkNotFound("잘못된 상품종류 입니다.");
        }
        return service.patchCategory(dto);
    }
     */

    /*
    @Operation(summary = "상품 카테고리PK 수정", description = "상품의 카테고리PK 수정")
    @PutMapping
    public ResVo putProdtCategory(@RequestBody AdminProdtCategoryUpdDto dto) {
        ProductPkExceptionVo pkProduct = productService.getPkProduct(dto.getProductPk());
        if(pkProduct == null) {
            throw new ExceptionProductPkNotFound("잘못된 상품PK 입니다.");
        }

        List<AdminCategorySelVo> category = adminService.getCategory();
        if(dto.getCategoryPk() < 1 || dto.getCategoryPk() > category.size()) {
            throw new ExceptionCategoryPkNotFound("잘못된 상품종류 입니다.");
        }

        return service.putProdtCategory(dto);
    }
     */
}
