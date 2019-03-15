package com.ObjectInjection;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Message {
    private String banana;


//   // public Message(String banana) {
//        this.banana = banana;
//    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public void show()
    { System.out.print("Hello World ");}
}
