package edu.whpu.controller;

import edu.whpu.client.GoodsFeignClient;
import edu.whpu.entity.Goods;
import edu.whpu.model.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/8 23:44
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private GoodsFeignClient goodsFeignClient;

    @GetMapping("/productList")
    public ResponseData<List<Goods>> getList() {
        ResponseData<List<Goods>> responseData = new ResponseData<>();
        List<Goods> goodsList = goodsFeignClient.getList();
        responseData.success(goodsList);
        return responseData;
    }

    @PostMapping("/saveGoods")
    public ResponseData<Boolean> saveList(@RequestBody Goods goods) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        responseData.success(goodsFeignClient.saveGoods(goods));
        return responseData;
    }
}
