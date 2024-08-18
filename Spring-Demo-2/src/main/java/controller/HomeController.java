package controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
public class HomeController {

   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/home/data")
    public String getHomeData(){
        return "Inside the Home Controller Method";
    }

   // Accepting the text body from postman in request
    @RequestMapping("/home/data/raw")
    public String acceptRawString(@RequestBody String data){
        System.out.println("Inside the accept Raw String method");
        System.out.println(data);
        return data;
    }

    // Accepting the json data in body
    @RequestMapping("/home/data/json")
    public String acceptJsonData(@RequestBody Map<String,String> map){
        for (String key: map.keySet()){
            System.out.println("Key: "+key+": value: "+map.get(key));
        }

        return "Success";
    }


    // Accepting the form data
    @RequestMapping("/home/data/form")
    public String acceptFormData(@RequestParam("username") String username,
                                 @RequestParam("password") String password){

        System.out.println(username+" : "+password);

        return "success";
    }

    //accepting the query parameters
    @RequestMapping("/home/data/query")
    public String acceptQueryParameters(@RequestParam("param1") String param1,
                                        @RequestParam("param2") String param2){
        System.out.println("param1: "+param1+" param2: "+param2);

        return "Success";
    }

    //accepting form url encoded data
    @RequestMapping("/home/data/formencoded")
    public String acceptFormURLEncodedData(@RequestBody MultiValueMap<String,String> multiValueMap){
        for (String key: multiValueMap.keySet()){
            System.out.println(key+": "+multiValueMap.get(key));
        }

        return "Success";
    }

  /*  @RequestMapping("/home/data/int")
    public ResponseEntity<int> returnInt(){
        int a = 2;
        return new ResponseEntity(a, HttpStatus.OK);
    }*/



    @RequestMapping("/home/data/create")
    public ResponseEntity<String> createdContent(@RequestBody Map<String,String> map, @RequestHeader("Accept-Encoding") String encoding){
        String msg = "Data Has been created";
        logger.info(encoding);
      /*  log.trace("This is trace Message");
        log.debug("This is debug Message");
        log.info("This is Info Message");
        log.warn("This is warn Message");
        log.error("This is error Message");*/

        MultiValueMap<String,String> httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("customName", "somename");
        return new ResponseEntity<>(msg, httpHeaders,HttpStatus.CREATED);
    }


    // accepting the headers from request














}
