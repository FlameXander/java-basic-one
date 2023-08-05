package ru.otus.java.basic.lesson11.oop2;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Box)) {
            return false;
        }
        Box another = (Box)obj;
        if (size == another.size && color.equals(another.color)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Box: " + size;
    }
}
