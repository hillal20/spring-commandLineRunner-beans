package springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.controllers;


import org.springframework.stereotype.Component;

@Component
public class Helper {

    public String greeting(String str ){
        return "Hello Guys" + str;
    }
}
