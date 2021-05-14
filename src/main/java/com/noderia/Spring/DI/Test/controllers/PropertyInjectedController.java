package com.noderia.Spring.DI.Test.controllers;

import com.noderia.Spring.DI.Test.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting() {
         return greetingService.sayGreeting();
    }
}
