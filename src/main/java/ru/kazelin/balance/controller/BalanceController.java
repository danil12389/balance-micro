package ru.kazelin.balance.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kazelin.balance.model.EnrollmentDTO;

@RestController
public class BalanceController {

    @PostMapping("/enroll")
    public void enroll(@RequestBody EnrollmentDTO enrollmentDTO)
    {

    }
}
