package com.secor.ecommerceapicompservice;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter @Setter
public class Order
{
    private String orderid;
    private String username;
    private Map<String, Integer> products; // list of product_id, quantity
    private String payment_id;
    private String status;
}
