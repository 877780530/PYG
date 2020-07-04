package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.sellgoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(version = "1.0.0",interfaceClass = BrandService.class)
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAll(){
        List<Brand> brands = brandService.queryAll();
        return brands;
    }
}
