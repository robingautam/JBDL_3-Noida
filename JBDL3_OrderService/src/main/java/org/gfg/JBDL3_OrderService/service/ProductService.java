package org.gfg.JBDL3_OrderService.service;

import org.gfg.JBDL3_OrderService.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProductByUserId(int userId){
        List<Product> productList = new ArrayList<>();
        if (userId==1){
            productList.add(new Product(1001,"Realme Mobile","This is realme mobile", 9009 ));
            productList.add(new Product(1002,"iPhone","This is apple mobile", 50000 ));
        }else if (userId==2){
            productList.add(new Product(1003,"HP Laptop","This is HP Laptop", 35000 ));
        }else if (userId==3){
            productList.add(new Product(1004,"Dell Mobile","This is dell mobile", 45000 ));
        }else {
            productList.add(new Product(1005," Generic product","This is spme product", 9009 ));
        }

        return productList;
    }
}
