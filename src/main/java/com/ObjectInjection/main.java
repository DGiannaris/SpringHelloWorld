package com.ObjectInjection;

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class main {

    public static void main (String args [])
    {
        ConfigurableApplicationContext context = SpringApplication.run(main.class, args);
        // Message HelloWorld = new Message("Hello World");
        // System.out.print(HelloWorld.get());
        Message mes = context.getBean(Message.class);
        mes.show();
    }
}
