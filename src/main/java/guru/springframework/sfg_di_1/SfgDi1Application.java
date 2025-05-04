package guru.springframework.sfg_di_1;

<<<<<<< HEAD
import guru.springframework.sfg_di_1.controllers.MyController;
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
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

>>>>>>> add-spring-project
@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {
<<<<<<< HEAD
		ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}
=======
		SpringApplication.run(SfgDi1Application.class, args);
	}

>>>>>>> add-spring-project
}
