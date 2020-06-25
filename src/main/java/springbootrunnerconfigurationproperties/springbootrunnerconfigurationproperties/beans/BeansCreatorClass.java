package springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.beans;

import org.springframework.context.annotation.Bean;

public class BeansCreatorClass {

      @Bean
      public  BeanExample getBeanExample(){
          return new BeanExample();
      }


      @Bean
    public Phone  getPhone(){
          return new Phone();
      }

}
