package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);

        System.out.println("更新以下");
        System.out.println("提交第三次");
        System.out.println("hot-fix");
        System.out.println("master耶耶");
        System.out.println("hot-fix耶耶");
        System.out.println("push test");
        System.out.println("pull test");  
    }

}
