package me.right42;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PersonProperies.class)
public class AutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public Person person(PersonProperies personProperies){
        Person person = new Person();
        person.setName(personProperies.getName());
        return person;
    }

}
