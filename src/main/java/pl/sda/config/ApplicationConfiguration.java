package pl.sda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pl.sda")
public class ApplicationConfiguration {


    @Bean
    public String newBean() {
        return "This is my new bean";
    }

}
