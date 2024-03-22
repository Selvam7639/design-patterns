package com.tamil.designpatterns;

import com.tamil.designpatterns.template_method.Football;
import com.tamil.designpatterns.template_method.Game;
import com.tamil.designpatterns.template_method.Hockey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		//Template Method Pattern

		Game hockey = new Hockey();
		hockey.play();
		Game football = new Football();
		football.play();

	}

}
