package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {
        users.add(new ForumUser(0, "username0", 'M', LocalDate.of(1935, 10, 12), 28));
        users.add(new ForumUser(1, "username1", 'F', LocalDate.of(1999, 9, 25), 128));
        users.add(new ForumUser(2, "username2", 'M', LocalDate.of(1997, 2, 5), 2));
        users.add(new ForumUser(3, "username3", 'F', LocalDate.of(2008, 1, 3), 845));
        users.add(new ForumUser(4, "username4", 'M', LocalDate.of(2002, 5, 1), 97));
        users.add(new ForumUser(5, "username5", 'F', LocalDate.of(1994, 7, 17), 65));
        users.add(new ForumUser(6, "username6", 'M', LocalDate.of(1999, 9, 22), 12));
        users.add(new ForumUser(7, "username7", 'F', LocalDate.of(1992, 2, 13), 31));
        users.add(new ForumUser(8, "username8", 'M', LocalDate.of(1991, 12, 22), 47));
        users.add(new ForumUser(9, "username9", 'F', LocalDate.of(1987, 6, 30), 91));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
    }
}
