package ru.otus.java.basic.lesson12.oop3.dogs;

public class Dog {
    private String name;
    private Ball ballInTeeth;

    public Dog(String name) {
        this.name = name;
    }

    public void play(Ball ball) {
        if (ball.getOwner() != null && ball.getOwner() != this) {
            System.out.println("С ним играет какая-то злая собака");
            return;
        }
        if (this.ballInTeeth == null) {
            System.out.println(name + " схватила в зубы мячик " + ball);
            this.ballInTeeth = ball;
            ball.setOwner(this);
            return;
        }
        if (this.ballInTeeth == ball) {
            System.out.println("\"Так я уже этот мячик дрежу в зубах..\"");
            return;
        }
        System.out.println(name + " выкинула мячик " + ballInTeeth);
        this.ballInTeeth.setOwner(null);
        this.ballInTeeth = ball;
        ball.setOwner(this);
        System.out.println(name + " схватила вместо него " + ballInTeeth);
    }
}
