package org.gfg.JBDL3_OrderService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    int id;
    String productName;
    String productDescription;
    double price;
}
