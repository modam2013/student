package com.calculator.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class Controller {
    @GetMapping
    public String hello(){
        return "Добро пожаловать";
    }
   @GetMapping(path = "/plus")
   public String plus(@RequestParam int num1,@RequestParam int num2) {
        int result = num1 + num2; return "" + result;
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2) {
        int result = num1 - num2; return "" +result;
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1,@RequestParam int num2) {
        int result = num1 * num2; return "" + result;
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam int num1,@RequestParam int num2) {
        int result = num1 / num2; return "" + result;
    }


}
