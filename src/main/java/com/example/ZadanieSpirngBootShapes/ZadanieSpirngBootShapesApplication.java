package com.example.ZadanieSpirngBootShapes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ZadanieSpirngBootShapesApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//CalculateService areaService = (CalculateService) applicationContext.getBean("calculateService");
		SpringApplication.run(ZadanieSpirngBootShapesApplication.class, args);
		//areaService.calculate();

	}
}