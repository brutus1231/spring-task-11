package pl.sda.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
        classes = ComponentScanCustomFilter.class), basePackages = {"pl.sda"})
@PropertySource("classpath:db.properties")
public class ApplicationConfiguration {

    @Bean
    public String newBean() {
        return "This is my new bean";
    }

}
