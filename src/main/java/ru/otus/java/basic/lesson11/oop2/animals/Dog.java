package ru.otus.java.basic.lesson11.oop2.animals;

public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкнул");
    }
}
