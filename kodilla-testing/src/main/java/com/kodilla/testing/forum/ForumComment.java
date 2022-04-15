package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {

    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return this.forumPost;
    }

    public void setForumPost(ForumPost forumPost) {
        this.forumPost = forumPost;
    }

    public String getCommentBody() {
        return this.commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ForumComment)) {
            return false;
        }
        ForumComment forumComment = (ForumComment) object;
        return Objects.equals(this.getForumPost(), forumComment.getForumPost())
                && Objects.equals(this.getCommentBody(), forumComment.getCommentBody())
                && Objects.equals(this.getAuthor(), forumComment.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = this.getForumPost().hashCode();
        result = 31 * result + this.getCommentBody().hashCode();
        result = 31 * result + this.getAuthor().hashCode();
        return result;
    }
}
