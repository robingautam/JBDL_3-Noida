package org.gfg.JBDL3_Security;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.gfg.JBDL3_Security.model.Person;
import org.gfg.JBDL3_Security.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PasswordEncoder passwordEncoder;


    @RequestMapping("/get/home")
    @GetMapping
    public String getHomeData(){
        log.info("Insider the getHomeData Method");
        return "Inside the Home Page";
    }

    @GetMapping
    @RequestMapping("/get/public")
    public String publicEndPoint(){
        return "This is public URL";
    }

    @PostMapping
    @RequestMapping("/create/user")
    public boolean createUser(@RequestBody Person person){
        boolean isSaved = false;
        try {
            String password = person.getPassword();
            person.setPassword(passwordEncoder.encode(password));
            personRepository.save(person);
            isSaved = true;
        }
        catch (Exception exception){
            isSaved = false;
        }
        return isSaved;
    }


    @GetMapping("/get/token")
    public CsrfToken getCSRFToken(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }

}
