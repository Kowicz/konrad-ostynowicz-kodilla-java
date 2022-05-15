package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = this.calculateNumberOfUsers(statistics);
        this.numberOfPosts = this.calculateNumberOfPosts(statistics);
        this.numberOfComments = this.calculateNumberOfComments(statistics);
        this.avgNumberOfPostsPerUser = this.calculateAvgPostsPerUser(statistics);
        this.avgNumberOfCommentsPerUser = this.calculateAvgCommentsPerUser(statistics);
        this.avgNumberOfCommentsPerPost = this.calculateAvgCommentsPerPost(statistics);
    }

    private int calculateNumberOfUsers(Statistics statistics) {
        return statistics.userNames().size();
    }

    private int calculateNumberOfPosts(Statistics statistics) {
        return statistics.postsCount();
    }

    private int calculateNumberOfComments(Statistics statistics) {
        return statistics.commentsCount();
    }

    private double calculateAvgPostsPerUser(Statistics statistics) {

        if (this.numberOfUsers <= 0) {
            return 0;
        }

        return (double) statistics.postsCount() / numberOfUsers;
    }

    private double calculateAvgCommentsPerUser(Statistics statistics) {

        if (this.numberOfUsers <= 0) {
            return 0;
        }

        return (double) statistics.commentsCount() / numberOfUsers;
    }

    private double calculateAvgCommentsPerPost(Statistics statistics) {

        if (this.numberOfPosts <= 0) {
            return 0;
        }

        return (double) statistics.commentsCount() / numberOfPosts;
    }

    public void showStatistics() {
        System.out.println("Total number of users: " + this.numberOfUsers);
        System.out.println("Total number of posts: " + this.numberOfPosts);
        System.out.println("Total number of comments: " + this.numberOfComments);
        System.out.println("Average number of posts per user: " + this.avgNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + this.avgNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + this.avgNumberOfCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return this.numberOfUsers;
    }

    public int getNumberOfPosts() {
        return this.numberOfPosts;
    }

    public int getNumberOfComments() {
        return this.numberOfComments;
    }

    public double getAvgNumberOfPostsPerUser() {
        return this.avgNumberOfPostsPerUser;
    }

    public double getAvgNumberOfCommentsPerUser() {
        return this.avgNumberOfCommentsPerUser;
    }

    public double getAvgNumberOfCommentsPerPost() {
        return this.avgNumberOfCommentsPerPost;
    }
}
