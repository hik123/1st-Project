package com.green.exproject.admin;


import com.green.exproject.admin.model.*;
import com.green.exproject.common.ResVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @Operation(summary = "카테고리 수정", description = "상품 카테고리 종류 수정")
    @PatchMapping
    public ResVo patchCategory(@RequestBody AdminCategoryUpDto dto) {
        return service.patchCategory(dto);
    }

    @PutMapping
    public ResVo putProdtCategory(@RequestBody AdminProdtCategoryUpDto dto) {
        return service.putProdtCategory(dto);
    }

    @Operation(summary = "유저 추가", description = "userPk: 1  <br>현재 USER 추가 불필요")
    @PostMapping("/user")
    public ResVo postUser(@RequestBody AdminUserInsDto dto) {
        return service.postUser(dto);
    }
}
