package ru.otus.java.basic.lesson13.oop4.interfaces;

public class InterfacesApp {
    public static void main(String[] args) {
        Closeable[] boxes = {new Box(), new Box()};
        Closeable[] boxes2 = {new Box(), new Box()};
        Closeable[] doors = {new Door(), new Door(), new Door()};
        Closeable[] wardrobes = {new Wardrobe(), new Wardrobe()};

        Closeable box = new Box();



    }

    public static void closeAll(Closeable[]... closeableThings) {
        for (int i = 0; i < closeableThings.length; i++) {
            for (int j = 0; j < closeableThings[i].length; j++) {
                closeableThings[i][j].close();
            }
        }
    }
}
