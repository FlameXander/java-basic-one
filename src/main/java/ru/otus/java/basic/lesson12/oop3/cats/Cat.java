package ru.otus.java.basic.lesson12.oop3.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(5);
        System.out.println(name + " поел");
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}
