package com.secor.ecommerceapicompservice;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter @Setter
public class Order
{
    private String orderid;
    private String restro_id;
    private String username;
    private Map<String, Integer> dishes; // list of dish_id, quantity
    private String payment_id;
    private String status;
}
