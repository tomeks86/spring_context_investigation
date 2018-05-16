package edu.tseidler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "myBean", initMethod = "creation", destroyMethod = "kill")
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
