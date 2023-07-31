package ru.otus.java.basic.lesson10.oop1;

public class Cat {
    private String name;
    private String color;
    private float weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color, float weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " покушал");
        weight += 0.01f;
    }

    public void meow() {
        System.out.println(name + " мяукнул");
    }

    public void jump() {
        System.out.println(name + " прыгнул");
    }

    public void info() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }
}
