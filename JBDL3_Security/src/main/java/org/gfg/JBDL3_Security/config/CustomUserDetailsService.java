package org.gfg.JBDL3_Security.config;

import org.gfg.JBDL3_Security.model.Person;
import org.gfg.JBDL3_Security.model.PersonUserDetails;
import org.gfg.JBDL3_Security.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    PersonRepository personRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.findByEmail(username);
        if (person==null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new PersonUserDetails(person);

    }
}
