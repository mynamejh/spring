package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // a href="/hello 를 get방식으로 가져온다.
    public String hello(Model model){
        model.addAttribute("data","HelloController~");
        return "hello";


        // model을 attribute에 넣는다. 키:"data" 값은 "hello" 가 hello.html에 <p th:text=~ +${data}> 에서 ${data}값으로 치환
        // data는 model에 던진다.
        // return "hello";는  resources>templates>'hello.html' 에 가서 렌더링 하라는 뜻이다(이  화면을 실행시켜라)


    }
}

