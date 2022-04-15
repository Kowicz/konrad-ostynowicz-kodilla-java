package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }
    public void addPost(String author, String postBody) {
        ForumPost forumPost = new ForumPost(postBody, author);
        posts.add(forumPost);
    }

    public void addComment(ForumPost forumPost, String author, String commentBody) {
        ForumComment forumComment = new ForumComment(forumPost, commentBody, author);
        comments.add(forumComment);
    }

    public int getPostsQuantity() {
        return this.posts.size();
    }

    public int getCommentsQuantity() {
        return this.comments.size();
    }

    public ForumPost getPost(int postNumber) {
        if (postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);
        }
        return null;
    }

    public ForumComment getComment(int commentNumber) {
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            return comments.get(commentNumber);
        }
        return null;
    }

    public boolean removePost(ForumPost forumPost) {
        return posts.remove(forumPost);
    }

    public boolean removeComment(ForumComment forumComment) {
        return comments.remove(forumComment);
    }

    public String getName() {
        return this.name;
    }

    public String getRealName() {
        return this.realName;
    }

}
