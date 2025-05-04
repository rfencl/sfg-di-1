package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.GreetingService;
import guru.springframework.sfg_di_1.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorIngectedControllerTest {

    ConstructorIngectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorIngectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}