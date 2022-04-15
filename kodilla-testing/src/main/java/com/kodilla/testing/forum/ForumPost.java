package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        ForumPost forumPost = (ForumPost) object;
        return Objects.equals(this.getPostBody(), forumPost.getPostBody())
                && Objects.equals(this.getAuthor(), forumPost.getAuthor());
    }

    @Override
    public int hashCode() {
        return 31 * this.getPostBody().hashCode() + this.getAuthor().hashCode();
    }
}
