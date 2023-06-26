package com.munna.ORDERSERVICE.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {

    private Long id;
    private String skuCode;
    private String price;
    private Integer quantity;
}
