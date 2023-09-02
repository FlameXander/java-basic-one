package ru.otus.java.basic.lesson13.oop4;

public enum PaymentSource {
    WEB(1, "Веб платеж"),
    MOBILE_ANDROID(1, "Android"),
    MOBILE_IOS(1, "IOs"),
    TELEGRAM(3, "Telegram"),
    SBP(1, "Система быстрых платежей")
    ;

    private int priority;
    private String description;

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    PaymentSource(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }
}
