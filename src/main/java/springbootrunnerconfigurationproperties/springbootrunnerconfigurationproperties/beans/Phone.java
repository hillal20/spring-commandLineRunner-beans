package springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.beans.BeanExample;


public class Phone {

    @Autowired
    BeanExample beanExample;

    public void print(){
        beanExample.fn();
    }

}
