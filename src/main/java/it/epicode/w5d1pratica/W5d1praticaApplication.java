package it.epicode.w5d1pratica;

import it.epicode.w5d1pratica.bean.Menu;
import it.epicode.w5d1pratica.service.PizzeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1praticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(W5d1praticaApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
