package com.green.exproject.product;


import com.green.exproject.product.model.*;
import com.green.exproject.common.ResVo;
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

    @Operation(summary = "상품 입력", description = "장바구니 목록에 카드 추가 <br>categoryPk 값 아래 카테고리 리스트 참고")
    @PostMapping
    public ResVo postProduct(@RequestBody ProductListInsDto dto){
        log.info("dto : {}", dto);
        return service.postProduct(dto);
    }

    @Operation(summary = "구매예정 상품 리스트", description = "isList 값이<br>0: 모든목록<br>1: 구매예정 목록<br>2: 구매확정 목록 " +
            "<br><br>createdAt: 입력 날짜에 생성된 목록만 보여줌 <br>buyingDate: 입력 날짜에 구매한 목록만 보여줌 <br>default값: 0000-00-00 날짜 상관없이 목록만 보여줌 ")
    @GetMapping
    public List<ProductListSelVo> getProduct(ProductListSelDto dto){
        log.info("dto : {}", dto);
        return service.getProduct(dto);
    }


    @Operation(summary = "구매예정 상품 수정", description = "구매예정 상품 수정 처리")
    @PutMapping
    public ResVo putProduct(@RequestBody ProductListUpDto dto) {
        log.info("dto : {}", dto);
        return service.putProduct(dto);
    }

    @Operation(summary = "상품 구매확정", description = "구매확정")
    @PatchMapping
    public ResVo patchProductCheck(@RequestBody ProductCompleteUpDto dto) {
        log.info("dto : {}", dto);
        return service.patchProductCheck(dto);
    }


    @Operation(summary = "상품 삭제", description = "구매예정 상품, 구매확정 상품 카드 삭제 처리 <br>복수 삭제 가능")
    @DeleteMapping
    public ResVo deleteProduct(@RequestBody ProductListDelDto dto) {
        log.info("dto : {}", dto);
        return service.deleteProduct(dto);
    }
}
