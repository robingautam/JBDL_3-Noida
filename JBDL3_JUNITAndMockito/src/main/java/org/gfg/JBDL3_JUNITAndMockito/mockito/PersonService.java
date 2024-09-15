package org.gfg.JBDL3_JUNITAndMockito.mockito;


import org.springframework.stereotype.Component;

@Component
public class PersonService {

    public String sayHello(){
        return "saying Hii";
    }

    public String checkPerson(){
        return "Person tested";
    }

    public String checkingArgument(int n, int i){
        return "You: "+n;
    }
}
