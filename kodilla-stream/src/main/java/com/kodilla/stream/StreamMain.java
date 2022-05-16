package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.getUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> LocalDate.now().getYear() - u.getBirthday().getYear() > 20)
                .filter(u -> u.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIndex, u -> u))
                .entrySet()
                .forEach(System.out::println);

    }
}
