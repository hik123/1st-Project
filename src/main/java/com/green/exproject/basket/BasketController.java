package com.green.exproject.basket;


import com.green.exproject.basket.model.*;
import com.green.exproject.common.ResVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class BasketController {
    private final BasketService service;

    @PostMapping
    public ResVo postProduct(@RequestBody PurListInsDto dto){
        log.info("dto : {}", dto);
        return service.postProduct(dto);
    }

    @GetMapping
    public List<PurListSelVo> getPurListAll(PurListSelDto dto){
        return service.postPurList(dto);
    }

    @PutMapping
    public ResVo putPurListAll(@RequestBody PurListUpDto dto) {
        return service.putPurListAll(dto);
    }

    @DeleteMapping
    public ResVo deleteProduct(@RequestBody PurListDelDto dto) {
        return service.deleteProduct(dto);
    }
}
