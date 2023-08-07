package ru.otus.java.basic.lesson12.oop3.cats;

public class Plate {
    private String color;
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(String color, int food) {
        this.color = color;
        this.food = food;
    }

    public void addFood(FoodPackage foodPackage) {
        if (foodPackage.isEmpty()) {
            System.out.println("Тут нечего насыпать");
            return;
        }
        food += foodPackage.transfer();
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    @Override
    public String toString() {
        return color + " plate: " + food;
    }
}
