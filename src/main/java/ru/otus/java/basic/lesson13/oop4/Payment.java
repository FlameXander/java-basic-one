package ru.otus.java.basic.lesson13.oop4;

public class Payment {
    private String id;
    private PaymentSource source;

    public PaymentSource getSource() {
        return source;
    }

    public Payment(String id, PaymentSource source) {
        this.id = id;
        this.source = source;
    }
}
