package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home/data")
    public String getHomeData(){
        return "Inside the Home Controller Method";
    }
}
