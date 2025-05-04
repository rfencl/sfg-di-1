package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.GreetingService;
import guru.springframework.sfg_di_1.services.GreetingServiceImpl;

/**
 * Not the way to do this, when the term property injection is used, it means that a memeber variable or property
 * is set via calling new and constructing the object.
 */
public class PropertyInjectedController {
    public GreetingService greetingService = new GreetingServiceImpl();

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
