# JavaDemo
```$xslt
   __                      ___                     
   \ \  __ ___   ____ _   /   \___ _ __ ___   ___  
    \ \/ _` \ \ / / _` | / /\ / _ \ '_ ` _ \ / _ \ 
 /\_/ / (_| |\ V / (_| |/ /_//  __/ | | | | | (_) |
 \___/ \__,_| \_/ \__,_/___,' \___|_| |_| |_|\___/ 

```

##Spring Boot Web 
### First Demo
1.首先需要在pom.xml文件中引入web模块
```xml
<dependencies>
	
	<dependency>
        <groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter</artifactId>
    </dependency>
    	
    <dependency>
    	<groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>    
</dependencies>

```

1.1引入Web模块，需添加spring-boot-starter-web模块：
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

2.创建一个controller 内容如下
本demo中我们选择使用RESTful Service
```java
package com.javademo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午12:51.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "Hello Spring Boot!!!";
    }
}

```

3.启动主程序，打开浏览器访问http://localhost:8080/hello，可以看到页面输出Hello Spring Boot!!!

### Demo 2
由于Spring Boot能够快速开发、便捷部署等特性，相信有很大一部分Spring Boot的用户会用来构建RESTful API。
而我们构建RESTful API的目的通都是由于多终端的原因，这些终端会共用很多底层业务逻辑，因此我们会抽象出这样一层来同时服务于多个移动端或者Web前端。
为了方便调试和测试，在项目中添加Swagger2依赖 

###添加Swagger2依赖

在pom.xml中加入Swagger2的依赖

```xml

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.2.2</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.2.2</version>
</dependency>

```

### 创建Swagger2配置类
在JavaDemoApplication.java同级创建Swagger2的配置类Swagger2。

```java

package com.javademo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午4:30.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.javademo.web"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://www.sushou.me/")
                .termsOfServiceUrl("http://www.sushou.me/")
                .contact("金色木叶枫")
                .version("1.0")
                .build();
    }

}


```