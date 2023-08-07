package ru.otus.java.basic.lesson12.oop3.cats;

public class CatFoodApplication {
    public static void main(String[] args) {
        Plate redPlate = new Plate("Red",100);
        Plate greenPlate = new Plate("Green",100);
        System.out.println(redPlate);
        System.out.println(greenPlate);

        Cat cat = new Cat("Barsik");
        System.out.println(cat);

        for (int i = 0; i < 10; i++) {
            cat.eat(greenPlate);
        }

        System.out.println(redPlate);
        System.out.println(greenPlate);

        FoodPackage foodPackage = new FoodPackage(20);
        greenPlate.addFood(foodPackage);
        greenPlate.addFood(foodPackage);
        System.out.println(greenPlate);
    }
}
