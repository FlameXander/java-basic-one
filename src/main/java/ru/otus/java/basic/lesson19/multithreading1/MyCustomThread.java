package ru.otus.java.basic.lesson19.multithreading1;

public class MyCustomThread {
    private Runnable r;

    public MyCustomThread(Runnable r) {
        this.r = r;
    }

    public void start() {
        r.run();
    }
}
