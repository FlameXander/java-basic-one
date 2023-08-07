package ru.otus.java.basic.lesson12.oop3;

import ru.otus.java.basic.lesson12.oop3.cats.Plate;

public class MainApplication {
    public static void main(String[] args) {
//        Dog dog = new Dog("Bobik");
//        System.out.println(dog);
//
//        Box box1 = new Box("RED", 5);
//        Box box2 = new Box("RED", 6);
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());

//        String s1 = "Java";
//        String s2 = "Java";
//        System.out.println(s1.equals(s2));
//
//        String s3 = new String("Java");
//        String s4 = new String("Java");
//        System.out.println(s3 == s4);

        String fullFilename = "data.123.txt";
        String filename = fullFilename.substring(0, fullFilename.lastIndexOf("."));
        System.out.println(filename);

        String f = "a";
        System.out.println(f);
        f = f.toUpperCase();
        System.out.println(f);
    }
}
