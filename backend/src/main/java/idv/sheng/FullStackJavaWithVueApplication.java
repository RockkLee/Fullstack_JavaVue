package idv.sheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"idv.sheng.controller"})
@SpringBootApplication
public class FullStackJavaWithVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackJavaWithVueApplication.class, args);
	}

}
