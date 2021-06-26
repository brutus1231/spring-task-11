package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.ApplicationConfiguration;
import pl.sda.config.DatabaseConfiguration;
import pl.sda.service.HelloWorldBo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        HelloWorldBo helloWorldBo = context.getBean(HelloWorldBo.class);
        helloWorldBo.printMessage("Marek");
        helloWorldBo.printProperty();

        DatabaseConfiguration dbConfig = context.getBean(DatabaseConfiguration.class);
        dbConfig.printDbConfig();

    }
}
