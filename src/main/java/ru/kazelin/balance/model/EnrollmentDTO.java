package ru.kazelin.balance.model;

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
