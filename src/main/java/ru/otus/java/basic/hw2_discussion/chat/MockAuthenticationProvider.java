package ru.otus.java.basic.hw2_discussion.chat;

public class MockAuthenticationProvider implements AuthenticationProvider {
    @Override
    public String findNicknameByLoginAndPassword(String login, String password) {
        return "MockUser";
    }
}
