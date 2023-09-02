package ru.otus.java.basic.hw2_discussion.chat;

public class ChatApp {
    public static void main(String[] args) {
        AuthenticationProvider authenticationProvider = new MockAuthenticationProvider();

        String login = "user2";
        String password = "pass21";

        String targetNickname = authenticationProvider.findNicknameByLoginAndPassword(login, password);
        if (targetNickname != null) {
            System.out.println("Вошел пользователь: " + targetNickname);
        } else {
            System.out.println("Пользователя не существует");
        }
    }
}
