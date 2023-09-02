package ru.otus.java.basic.hw2_discussion;

public class Cross {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    public void doIt(Participant p) {
        p.run(length);
    }
}
