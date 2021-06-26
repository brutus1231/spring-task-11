package pl.sda.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBoImpl implements HelloWorldBo {

    @Override
    public void printMessage(String message) {
        System.out.println("Hello world " + message);
    }
}
