package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.GreetingService;

public class ConstructorIngectedController {

    private final GreetingService greetingService;

    public ConstructorIngectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
