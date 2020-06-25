package springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.beans.BeansCreatorClass;
import springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.beans.Phone;
import springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.controllers.Helper;

@SpringBootApplication
public class SpringBootRunnerConfigurationPropertiesApplication  implements CommandLineRunner, ApplicationRunner {



    public static void main(String[] args){
        SpringApplication.run(SpringBootRunnerConfigurationPropertiesApplication.class, args);
        System.out.println("==== spring boot commandLine is running === ");

        // load all the custom beans that we created into the application context to use it via autowire everywhere
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansCreatorClass.class);

          Phone phone = applicationContext.getBean(Phone.class);
          phone.print();




    }

    // commandLineRunner
    public void run(String... args) throws Exception {
        System.out.println("===  commandLine Runner is here  ==== ");

    }


    // application runner
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=== application runner is here ====");

    }
}
