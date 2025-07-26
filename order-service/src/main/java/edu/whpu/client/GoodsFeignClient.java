package edu.whpu.client;

import edu.whpu.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author bin_wen
 * @date 2025/2/8 23:40
 */
@FeignClient(value = "goods-service", path = "/goods")
public interface GoodsFeignClient {

    @GetMapping("/list")
    List<Goods> getList();

    @GetMapping("/{id}")
    Goods getById(@PathVariable("id") Long id);

    @PostMapping("/save")
    Boolean saveGoods(@RequestBody Goods goods);
}
