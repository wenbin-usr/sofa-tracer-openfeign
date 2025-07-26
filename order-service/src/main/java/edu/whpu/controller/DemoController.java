package edu.whpu.controller;

import edu.whpu.client.GoodsFeignClient;
import edu.whpu.entity.Product;
import edu.whpu.model.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/8 23:44
 */
@RestController
public class DemoController {

    @Autowired
    private GoodsFeignClient goodsFeignClient;

    @GetMapping("/demo")
    public List<Product> getList() {
        return goodsFeignClient.getList();
    }

    @PostMapping("/save")
    public ResponseData<Boolean> saveList(@RequestBody Product product) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        responseData.success(goodsFeignClient.saveProduct(product));
        return responseData;
    }
}
