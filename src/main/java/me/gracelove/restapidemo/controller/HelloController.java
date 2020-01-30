package me.gracelove.restapidemo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("helloworld/string")
    @ResponseBody
    public String helloWorldString() {
        return "Hello World!";
    }

    @GetMapping("helloworld/json")
    @ResponseBody
    public Hello helloWorldJson() {
        Hello hello = new Hello();
        hello.message = "Hello world!";
        return hello;
    }

    @GetMapping("helloworld/page")
    public String helloWorldPage() {
        return "helloworld";
    }

    @Getter
    @Setter
    public static class Hello {
        private String message;
    }
}
