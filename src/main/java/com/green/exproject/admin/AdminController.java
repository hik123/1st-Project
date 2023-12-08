package com.green.exproject.admin;


import com.green.exproject.admin.model.AdminCategoryInsDto;
import com.green.exproject.admin.model.AdminUserInsDto;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {
    private final AdminService service;

    @PostMapping("/category")
    public ResVo postCategory(@RequestBody AdminCategoryInsDto dto) {
        return service.postCategory(dto);
    }

    @PostMapping("/user")
    public ResVo postUser(@RequestBody AdminUserInsDto dto) {
        return service.postUser(dto);
    }
}
