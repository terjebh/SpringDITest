package com.noderia.Spring.DI.Test;

import com.noderia.Spring.DI.Test.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiTestApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringDiTestApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
