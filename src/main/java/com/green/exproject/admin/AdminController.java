package com.green.exproject.admin;


import com.green.exproject.admin.model.AdminCategoryInsDto;
import com.green.exproject.admin.model.AdminUserInsDto;
import com.green.exproject.common.ResVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@Tag(name = "관리자", description = "관리자 영역")
public class AdminController {
    private final AdminService service;

    @Operation(summary = "카테고리 추가", description = "상품 카테고리 종류 추가")
    @PostMapping("/category")
    public ResVo postCategory(@RequestBody AdminCategoryInsDto dto) {
        return service.postCategory(dto);
    }

    @Operation(summary = "유저 추가", description = "")
    @PostMapping("/user")
    public ResVo postUser(@RequestBody AdminUserInsDto dto) {
        return service.postUser(dto);
    }
}
