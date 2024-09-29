package org.gfg.JBDL3_UserService.feign;

import org.gfg.JBDL3_UserService.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "JBDL3-ORDERSERVICE")
public interface OrderClient {

    @GetMapping("/order-service/order/user/{id}")
    public List<Product> getProductList(@PathVariable("id") int userId);
}
