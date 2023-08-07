package ru.otus.java.basic.lesson12.oop3.dogs;

public class DogsApp {
    public static void main(String[] args) {
        Ball ball1 = new Ball("RED");
        Ball ball2 = new Ball("GREEN");

        Dog dog1 = new Dog("Belka");
        Dog dog2 = new Dog("Strelka");

        dog1.play(ball1);
        dog1.play(ball1);
        dog1.play(ball2);
        dog2.play(ball2);
        dog2.play(ball1);
    }
}
