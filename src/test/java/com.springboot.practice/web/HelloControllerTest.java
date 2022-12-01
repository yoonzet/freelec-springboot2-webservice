package com.springboot.practice.web;

import com.springboot.practice.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class) /* 테스트를 진행할때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다.
 여기서는 SpringRunner라는 스프링 실행자를 사용.*/
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired //스프링이 관리하는 빈(Bean)을 주입받는다.
    private MockMvc mvc;

    @Test
    public void helloTest() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) //MockMvc를 통해 /hello 주소로 Get요청을 한다.
                .andExpect(status().isOk()) // HTTP Header의 Status를 검증한다.
                .andExpect(content().string(hello)); // 본문의 내용을 검증한다.
    }
}
