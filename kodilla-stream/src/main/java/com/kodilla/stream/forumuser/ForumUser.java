package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int index;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int numberOfPosts;

    public ForumUser(final int index, final String username, final char sex, final LocalDate birthday,
                     final int numberOfPosts) {
        this.index = index;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.numberOfPosts = numberOfPosts;
    }

    public int getIndex() {
        return this.index;
    }

    public String getUsername() {
        return this.username;
    }

    public char getSex() {
        return this.sex;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public int getNumberOfPosts() {
        return this.numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "index=" + index +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}