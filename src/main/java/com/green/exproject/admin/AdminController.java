package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
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
@RequestMapping("/api/admin")
@Tag(name = "관리자", description = "관리자 영역")
public class AdminController {
    private final AdminService service;

    @Operation(summary = "카테고리 추가", description = "상품 카테고리 종류 추가")
    @PostMapping
    public ResVo postCategory(@RequestBody AdminCategoryInsDto dto) {
        return service.postCategory(dto);
    }

    @Operation(summary = "카테고리 리스트", description = "isCategory 값:1 <br>전체 카테고리 리스트 보기 ")
    @GetMapping
    public List<AdminCategorySelVo> getCategory(AdminCategorySelDto dto) {
        return service.getCategory(dto);
    }
    @Operation(summary = "카테고리 수정", description = "카테고리 종류 수정")
    @PatchMapping
    public ResVo patchCategory(@RequestBody AdminCategoryUpDto dto) {
        return service.patchCategory(dto);
    }

    @Operation(summary = "상품의 카테고리 수정", description = "상품의 카테고리PK 수정")
    @PutMapping
    public ResVo putProdtCategory(@RequestBody AdminProdtCategoryUpDto dto) {
        return service.putProdtCategory(dto);
    }

    @Operation(summary = "회원가입")
    @PostMapping("/signup")
    public ResVo postUser(@RequestBody AdminSignupDto dto) {
        return service.postUser(dto);
    }


    @Operation(summary = "로그인")
    @PostMapping("/signin")
    public AdminSigninVo getUserSignin(@RequestBody AdminSigninDto dto) {
        log.info("dto : {}", dto);
        return service.getUserSignin(dto);
    }
}
