package ru.otus.java.basic.hw2_discussion.auto;

import java.util.List;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Transport[] transports = {
                new Car(),
                new Horse()
        };
        Human h = new Human();
        for (Transport t : transports) {
            // in
            h.move(t);
            // out
        }
    }

    public static void race(List<Car> cars) {

    }
}
