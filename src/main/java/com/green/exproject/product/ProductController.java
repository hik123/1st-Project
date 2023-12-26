package com.green.exproject.product;


import com.green.exproject.category.CategoryService;
import com.green.exproject.category.model.CategorySelVo;
import com.green.exproject.exception.ExceptionMessagePrint;
import com.green.exproject.product.model.*;
import com.green.exproject.common.ResVo;
import com.green.exproject.user.UserService;
import com.green.exproject.user.model.UserSigninProcVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@Tag(name = "장바구니 컨트롤러", description = "장바구니 CRUD")
public class ProductController {
    private final ProductService service;
    private final CategoryService adminService;
    private final UserService userService;

    @Operation(summary = "상품 입력", description = "장바구니 목록에 카드 추가 <br>categoryPk 값 아래 카테고리 리스트 참고")
    @PostMapping
    public ResVo postProduct(@RequestBody ProductListInsDto dto){
        log.info("dto : {}", dto);

        UserSigninProcVo vo = userService.getUserPkInfo(dto.getUserPk());
        if(vo == null) {
            throw new ExceptionMessagePrint("잘못된 유저PK 입니다.");
        }
        List<CategorySelVo> category = adminService.getCategory();
        if(dto.getCategoryPk() < 1 || dto.getCategoryPk() > category.size()) {
            throw new ExceptionMessagePrint("잘못된 상품종류 입니다.");
        }
        return service.postProduct(dto);
    }

    @Operation(summary = "구매예정 상품 리스트", description = "choiceList 값이" +
            "<br>0: 모든목록<br>1: 구매예정 목록<br>2: 구매확정 목록 ")
    @GetMapping
    public List<ProductListSelVo> getProduct(ProductListSelDto dto){
        log.info("dto : {}", dto);

        UserSigninProcVo vo = userService.getUserPkInfo(dto.getUserPk());
        if(vo == null) {
            throw new ExceptionMessagePrint("잘못된 유저PK 입니다.");
        }
        if(dto.getChoiceList() < 0 || dto.getChoiceList() > 2) {
            throw new ExceptionMessagePrint("잘못된 입력! ChoiceList 값을 다시 입력해주세요.");
        }
        return service.getProduct(dto);
    }

    @Operation(summary = "구매예정 상품 수정", description = "구매예정 상품 수정 처리")
    @PutMapping
    public ResVo putProduct(@RequestBody ProductListUpdDto dto) {
        log.info("dto : {}", dto);

        UserSigninProcVo vo = userService.getUserPkInfo(dto.getUserPk());
        if(vo == null) {
            throw new ExceptionMessagePrint("잘못된 유저PK 입니다.");
        }

        ProductPkExceptionVo pkProduct = service.getPkProduct(dto.getProductPk());
        if(pkProduct == null) {
            throw new ExceptionMessagePrint("잘못된 상품PK 입니다.");
        }
        List<CategorySelVo> category = adminService.getCategory();
        if(dto.getCategoryPk() < 1 || dto.getCategoryPk() > category.size()) {
            throw new ExceptionMessagePrint("잘못된 상품 카테고리 입니다.");
        }

        return service.putProduct(dto);
    }

    @Operation(summary = "상품 구매확정", description = "구매확정")
    @PatchMapping
    public ResVo patchProductCheck(@RequestBody ProductCompleteUpdDto dto) {
        log.info("dto : {}", dto);

        UserSigninProcVo vo = userService.getUserPkInfo(dto.getUserPk());
        if(vo == null) {
            throw new ExceptionMessagePrint("잘못된 유저PK 입니다.");
        }

        ProductPkExceptionVo pkProduct = service.getPkProduct(dto.getProductPk());
        if(pkProduct == null) {
            throw new ExceptionMessagePrint("잘못된 상품PK 입니다.");
        }
        return service.patchProductCheck(dto);
    }


    @Operation(summary = "상품 삭제", description = "구매예정 상품, 구매확정 상품 카드 삭제 처리")
    @DeleteMapping
    public ResVo deleteProduct(@RequestBody ProductListDelDto dto) {
        log.info("dto : {}", dto);

        UserSigninProcVo vo = userService.getUserPkInfo(dto.getUserPk());
        if(vo == null) {
            throw new ExceptionMessagePrint("잘못된 유저PK 입니다.");
        }

        ProductPkExceptionVo pkProduct = service.getPkProduct(dto.getProductPk());
        if(pkProduct == null) {
            throw new ExceptionMessagePrint("잘못된 상품PK 입니다.");
        }
        return service.deleteProduct(dto);
    }
}
