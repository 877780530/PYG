package com.pinyougou.sellgoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.sellgoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

@Service(interfaceClass = BrandService.class,version = "1.0.0")
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandMapper brandMapper;

    @Override
    public List<Brand> queryAll() {
        return brandMapper.queryAll();
    }
}
