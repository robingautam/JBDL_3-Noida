package org.gfg.JBDL3_JUNITAndMockito;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    int id;
    String name;
    String email;

    public String eat(){
        return "Person is eating";
    }

    public String run(){
        return "Person is running";
    }
}
