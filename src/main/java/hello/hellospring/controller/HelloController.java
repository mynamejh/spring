package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello") // a href="/hello 를 get방식으로 가져온다.
    public String hello(Model model) {
        model.addAttribute("data", "HelloController~");
        return "hello";


        // model을 attribute에 넣는다. 키:"data" 값은 "hello" 가 hello.html에 <p th:text=~ +${data}> 에서 ${data}값으로 치환
        // data는 model에 던진다.
        // return "hello";는  resources>templates>'hello.html' 에 가서 렌더링 하라는 뜻이다(이  화면을 실행시켜라)


    }

    @GetMapping("hello-mvc")
    //외부에서 파라미터 받을때 : requestparam("")

    public String helloMvc(@RequestParam("name") String name, Model model) {//model에 담으면 그걸 view에서 랜더링 할때 사용.
        model.addAttribute("name", name); //"name" 은 key, 뒤 name 파라미터 name 값
        return "hello-template"; // hello-template으로 이동. [ templates 폴더> hello-template.html만들기 ]

    }

    @GetMapping("hello-string")
    @ResponseBody // http에서 body부에 이 데이터(내용)를 직접 넣어주겠다는 의미. view 없이 그대로 출력함.
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        //객체 생성 _ 자동완성 단축키 ctrl + shift + enter
        // json "key":"값" 으로 구성 _ json으로 반환됨.(xml은 너무 무거워서 잘 안씀)
        Hello hello = new Hello();
        hello.setName(name);
        return hello;


    }

    //클래스 생성_ getter(꺼내주기)/ setter(넣어주기)
    static class Hello {
        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

