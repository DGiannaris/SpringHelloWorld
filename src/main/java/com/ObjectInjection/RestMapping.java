package com.ObjectInjection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMapping {

    @RequestMapping("/")
   public String HelloWorld()
   {
       return "Hello World";
   }

}
