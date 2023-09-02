package ru.otus.java.basic.hw2_discussion.chat;

import java.util.List;

public class InMemoryAuthenticationProvider implements AuthenticationProvider {
    class User {
        private String login;
        private String password;
        private String nickname;

        public User(String login, String password, String nickname) {
            this.login = login;
            this.password = password;
            this.nickname = nickname;
        }
    }

    private List<User> users;

    public InMemoryAuthenticationProvider() {
        this.users = List.of(
                new User("user1", "pass1", "Jack"),
                new User("user2", "pass2", "Bob"),
                new User("user3", "pass3", "User")
        );
    }

    @Override
    public String findNicknameByLoginAndPassword(String login, String password) {
        for (User u : users) {
            if (u.login.equals(login) && u.password.equals(password)) {
                return u.nickname;
            }
        }
        return null;
    }
}
