package pl.sda.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.hostname}")
    private String dbHost;

    @Value("${db.port}")
    private String dbPort;

    public void printDbConfig() {
        System.out.println("dbHost: " + dbHost + " port: " + dbPort);
    }
}
