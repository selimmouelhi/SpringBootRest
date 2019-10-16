package restMainApplication.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"restMainApplication.controller"})
@SpringBootApplication
public class RestMainApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(RestMainApplication.class, args);
		
	}

}
