package ru.otus.java.basic.lesson24.generics;

public class BoxGeneric<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public BoxGeneric(T obj) {
        this.obj = obj;
    }
}
