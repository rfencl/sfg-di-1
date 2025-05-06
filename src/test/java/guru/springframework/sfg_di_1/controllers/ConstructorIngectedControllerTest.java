package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorIngectedControllerTest {

    ConstructorIngectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorIngectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}