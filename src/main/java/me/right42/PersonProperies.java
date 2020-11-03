package me.right42;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("person")
public class PersonProperies {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
