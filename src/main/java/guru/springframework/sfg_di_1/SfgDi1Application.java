package guru.springframework.sfg_di_1;

import guru.springframework.sfg_di_1.controllers.ConstructorInjectedController;
import guru.springframework.sfg_di_1.controllers.ConstructorInjectedController;
import guru.springframework.sfg_di_1.controllers.MyController;
import guru.springframework.sfg_di_1.controllers.PropertyInjectedController;
import guru.springframework.sfg_di_1.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * Main Spring Boot Application class.
 * Enables Spring Boot Admin Server functionality for monitoring and managing Spring Boot applications.
 * The application will serve both as a Spring Boot Admin Server and as a client that registers with itself.
 */
@EnableAdminServer
@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println("-------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(("setterInjectedController"));

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
