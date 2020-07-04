package com.pinyougou;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDao {
    @Test
    public void test_QueryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        System.out.println(applicationContext);

        BrandMapper brandMapper = applicationContext.getBean(BrandMapper.class);
        List<Brand> brands = brandMapper.queryAll();
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }
}
