package com.practise;


import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoHelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoHelloWorld.class,args);

    }

    @GetMapping
    public String SayHello(@RequestParam(required = false,name="who") String who){
        if (StrUtil.isBlank(who)){
            who = "World";
        }
        return StrUtil.format("Hello ,{}",who);
    }
}
