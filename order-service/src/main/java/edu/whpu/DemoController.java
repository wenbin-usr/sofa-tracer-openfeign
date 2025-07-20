package edu.whpu;

import edu.whpu.client.ProductFeignClient;
import edu.whpu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/8 23:44
 */
@RestController
public class DemoController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/demo")
    public List<Product> getList() {
        return productFeignClient.getList();
    }
}
