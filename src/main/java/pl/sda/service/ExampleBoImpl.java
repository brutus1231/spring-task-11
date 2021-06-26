package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleBoImpl {

    @Autowired
    private HelloWorldBo helloWorldBo;

    @Autowired(required = false)
    private WrongExampleBo wrongExampleBo;
}
