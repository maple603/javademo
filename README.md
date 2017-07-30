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
		
		<!-- 测试 -->
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
本demo中我们选择使用REST
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