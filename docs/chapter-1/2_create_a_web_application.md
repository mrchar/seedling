# 创建一个Web项目

# Spring

Spring 是一个流行的Java框架

## Spring Boot

Spring Boot 基于Spring的自动配置框架

## Spring Web Starter

Spring Web Starter 是Spring Boot Web开发的自动配置库

## 创建项目

类似于第一节创建SpringBoot的过程，在选择依赖的步骤，选择Spring Web

## 创建Controller

编辑`demo1/src/main/java/com/example/demo1/Demo1Application.java`，最终如下：

```java
package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo1Application {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
```

## 运行

运行Demo1Application会打印出
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.4)

2022-03-16 22:04:02.759  INFO 10000 --- [           main] com.example.demo1.Demo1Application       : Starting Demo1Application using Java 17.0.2 on Desktop with PID 10000 (C:\Users\Seedling\Documents\Seedling\demo1\bin\main started by Seedling in C:\Users\Seedling\Documents\Seedling\demo1)
2022-03-16 22:04:02.762  INFO 10000 --- [           main] com.example.demo1.Demo1Application       : No active profile set, falling back to 1 default profile: "default"
2022-03-16 22:04:03.596  INFO 10000 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-03-16 22:04:03.609  INFO 10000 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-03-16 22:04:03.609  INFO 10000 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.58]
2022-03-16 22:04:03.680  INFO 10000 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-03-16 22:04:03.680  INFO 10000 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 871 ms
2022-03-16 22:04:03.998  INFO 10000 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-03-16 22:04:04.008  INFO 10000 --- [           main] com.example.demo1.Demo1Application       : Started Demo1Application in 1.585 seconds (JVM running for 1.919)
```

# 访问

使用浏览器访问`http://localhost:8080/`可以打开网页显示`Hello World!`