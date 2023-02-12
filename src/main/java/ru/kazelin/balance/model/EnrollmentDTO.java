package ru.kazelin.balance.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class EnrollmentDTO extends UserDTO {

    private final double moneyAmount;

    public EnrollmentDTO(String userId, double moneyAmount) {
        super(userId);
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }
}
