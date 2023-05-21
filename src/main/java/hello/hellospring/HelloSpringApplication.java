package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// test_ 아래 프로그램을 실행, main 입력하지 않으면 실행 되지 않음
		SpringApplication.run(HelloSpringApplication.class, args);

	}

}
