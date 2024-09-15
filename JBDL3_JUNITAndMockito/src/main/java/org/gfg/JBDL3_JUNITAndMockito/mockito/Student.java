package org.gfg.JBDL3_JUNITAndMockito.mockito;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    int id;
    String name;
    String email;


}
