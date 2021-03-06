package com.kodilla.testing.user;

import java.util.Objects;

public class SimpleUser {
    private String username;
    private String realName;

    public SimpleUser(String username) {
        this.username = username;
    }

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getRealName() {
        return this.realName;
    }
}
