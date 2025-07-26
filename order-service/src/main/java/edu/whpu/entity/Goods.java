package edu.whpu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Long goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private String goodsDesc;

}
