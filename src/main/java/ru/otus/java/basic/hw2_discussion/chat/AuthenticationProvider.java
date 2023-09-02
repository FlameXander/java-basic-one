package ru.otus.java.basic.hw2_discussion.chat;

public interface AuthenticationProvider {
    String findNicknameByLoginAndPassword(String login, String password);
}
