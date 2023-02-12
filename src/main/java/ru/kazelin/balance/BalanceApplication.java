package ru.kazelin.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.kazelin.balance.controller.BalanceController;

@SpringBootApplication
@ComponentScan(basePackages = "ru.kazelin.balance")
public class BalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalanceApplication.class, args);
	}

}
