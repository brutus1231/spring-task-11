package pl.sda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
        classes = ComponentScanCustomFilter.class), basePackages = {"pl.sda"})
public class ApplicationConfiguration {

    @Bean
    public String newBean() {
        return "This is my new bean";
    }

}
