package ru.kazelin.balance.model;

import org.springframework.stereotype.Component;

public class UserDTO {

    private final String userId;

    public UserDTO(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
