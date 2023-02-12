package ru.kazelin.balance.controller;

import org.springframework.web.bind.annotation.*;
import ru.kazelin.balance.model.EnrollmentDTO;

@RestController
public class BalanceController {

    @GetMapping("/tes")
    public String hello() {
        System.out.println("hahaha");
        return "Hello!";
    }
}
