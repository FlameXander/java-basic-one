package ru.otus.java.basic.hw2_discussion.xo;

public class AppXO {
    public static void main(String[] args) {
        Player[] players = {
                new AiPlayer(),
                new AiPlayer()
        };

        while (true) {
            players[0].turn();
            // ...
            players[1].turn();
            // ...
        }
    }
}
