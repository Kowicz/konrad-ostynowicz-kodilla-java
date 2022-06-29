package com.kodilla.good.patterns.challenges.delivery;

public class User {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String id;

    public User(String firstName, String lastName, String address, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getId() {
        return this.id;
    }
}
