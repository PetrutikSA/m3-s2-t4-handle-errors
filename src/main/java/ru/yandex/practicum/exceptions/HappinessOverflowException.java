package ru.yandex.practicum.exceptions;

public class HappinessOverflowException extends RuntimeException {
    private final int happinessLevel;
    public HappinessOverflowException(String message, int happinessLevel) {
        super(message);
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }
}
