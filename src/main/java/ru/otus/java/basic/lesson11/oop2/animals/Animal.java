package ru.otus.java.basic.lesson11.oop2.animals;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name);
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    public abstract void voice();
}
