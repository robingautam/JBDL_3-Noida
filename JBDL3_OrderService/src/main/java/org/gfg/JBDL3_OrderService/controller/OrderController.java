package org.gfg.JBDL3_OrderService.controller;

import org.gfg.JBDL3_OrderService.model.Product;
import org.gfg.JBDL3_OrderService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    ProductService productService;

    @GetMapping("/order-service/order/user/{id}")
    public List<Product> getProductList(@PathVariable("id") int userId){
        return productService.getProductByUserId(userId);
    }
}
