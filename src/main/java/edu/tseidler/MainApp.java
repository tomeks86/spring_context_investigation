package edu.tseidler;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("myBean");

        helloWorld.sayHello();

        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
