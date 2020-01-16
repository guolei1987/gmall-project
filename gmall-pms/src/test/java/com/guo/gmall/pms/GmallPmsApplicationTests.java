package com.guo.gmall.pms;

import com.guo.gmall.pms.entity.Brand;
import com.guo.gmall.pms.entity.Product;
import com.guo.gmall.pms.service.BrandService;
import com.guo.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        Product byId = productService.getById(1);
//       System.out.println(byId.getName());
        Brand brand = new Brand();
        brand.setName("Iphone3000");
        brandService.save(brand);
    }

}
