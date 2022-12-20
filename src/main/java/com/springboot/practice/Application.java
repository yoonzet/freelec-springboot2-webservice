package com.springboot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { //이 클래스는 앞으로 만들 프로젝트의 메인클래스가 된다.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
