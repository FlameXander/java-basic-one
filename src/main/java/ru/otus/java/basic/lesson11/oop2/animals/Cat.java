package ru.otus.java.basic.lesson11.oop2.animals;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукнул");
    }

    public void jumpOnTree() {
        System.out.println("jump on tree");
    }
}
