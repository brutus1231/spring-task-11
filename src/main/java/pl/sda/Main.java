package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.ApplicationConfiguration;
import pl.sda.service.HelloWorldBo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        HelloWorldBo helloWorldBo = context.getBean(HelloWorldBo.class);
        helloWorldBo.printMessage("Marek");
    }
}
