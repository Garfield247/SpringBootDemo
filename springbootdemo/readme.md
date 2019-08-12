# Spring Boot Hello World

## `pox.xml`
```pom
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>1.5.21.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>cn.hutool</groupId>
        <artifactId>hutool-all</artifactId>
        <version>4.6.1</version>
    </dependency>
</dependencies>
```

## `com.practise.SpringBootDemoHelloWorld.java`
```java
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
```