package org.gfg.JBDL3_UserService.service;

import org.gfg.JBDL3_UserService.feign.OrderClient;
import org.gfg.JBDL3_UserService.model.Product;
import org.gfg.JBDL3_UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrderClient orderClient;

   static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1,"Robin","robin@gmail.com",null));
        userList.add(new User(2,"Sagar","sagar@gmail.com",null));
        userList.add(new User(3,"Preeti","preeti@gmail.com",null));
        userList.add(new User(4,"Sanju","sanju@gmail.com",null));
    }

    public User getUserById(int id){
        User user = null;
        for (User u: userList){
            if (u.getId()==id){
                user = u;
                break;
            }
        }
       if (user==null){
           return null;
       }

   // List<Product> productList =  restTemplate.getForObject("https://JBDL3_ORDERSERVICE/order-service/order/user/"+user.getId(), List.class);
        List<Product> productList =  orderClient.getProductList(user.getId());
    user.setProductList(productList);
    return user;
    }

    public List<User> getAllUser(){
        return userList;
    }
}
