package com.kodilla.good.patterns.challenges.lento;

public class User {
    private final String firstName;
    private final String lastName;
    private final String nick;

    public User(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNick() {
        return this.nick;
    }
}
