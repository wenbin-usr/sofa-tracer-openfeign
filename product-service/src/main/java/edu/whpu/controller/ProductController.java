package edu.whpu.controller;

import edu.whpu.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/7 00:18
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
    public List<Product> getList() {
        return Arrays.asList(new Product(10010L, "苹果手机13pro", 8999.99D));
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") Long id) {
        return new Product(id, "苹果手机13pro", 8999.99D);
    }

    @PostMapping("/save")
    public Boolean saveProduct(@RequestBody Product product) {
        System.out.println(product.getName());
        return true;
    }
}
