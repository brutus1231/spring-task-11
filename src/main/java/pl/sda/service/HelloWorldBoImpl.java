package pl.sda.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldBoImpl implements HelloWorldBo {

    @Value("${db.username}")
    private String dbUser;

    @Value("${db.password}")
    private String dbPassword;

    @Override
    public void printMessage(String message) {
        System.out.println("Hello world " + message);
    }

    @Override
    public void printProperty() {
        System.out.println("username: " + dbUser + " hasło: " + dbPassword);
    }
}
