package ru.otus.java.basic.lesson19.multithreading1;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void a() {

    }

    public void b() {}

}
