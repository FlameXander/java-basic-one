package ru.otus.java.basic.lesson10.oop1;

public class MainApplication {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Cat[] cats = {
                new Cat("Барсик1", "Черный", 2.5f, 3),
                new Cat("Барсик2", "Черный", 2.5f, 3),
                new Cat("Барсик2", "Черный", 2.5f, 3),
                new Cat("Барсик3", "Черный", 2.5f, 3)
        };
        // Cat[] cats = new Cat[4];
        // cats[0] = new Cat("Барсик1", "Черный", 2.5f, 3);
        // ...
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }

        Cat c1 = new Cat("Barsik", "White", 2, 2);
        Cat c2 = new Cat("Murzik", "Black", 2, 2);
        c2 = c1;
        c1.setName("Smoke");
        c2.setColor("Purple");
        c1.info();
        c2.info();
    }
}
