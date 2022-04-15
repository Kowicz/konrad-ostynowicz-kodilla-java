package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of ForumTestSuite tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All ForumTestSuite tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test #" + ++testCounter);
    }

    @Nested
    @DisplayName("Tests for posts.")
    class TestPosts {

        @DisplayName("When newly created ForumUser add the first post, then getPostsQuantity() method should return 1.")
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

            //When
            forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");

            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

        @DisplayName("When a created post gets added to the ForumUser," +
                "then a post retrieved via getter should be same as the post created earlier.")
        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");
            forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());

            //When
            ForumPost retrievedPost = forumUser.getPost(0);

            //Then
            Assertions.assertEquals(forumPost, retrievedPost);
        }

        @DisplayName("When a created post gets removed, but is not added to the ForumUser, then return false.")
        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");

            //When
            boolean result = forumUser.removePost(forumPost);

            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("When an only post gets removed from the ForumUser, then return true and change PostsQuantity to 0.")
        @Test
        void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");
            forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());

            //When
            boolean result = forumUser.removePost(forumPost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuantity());
        }

    }

    @Nested
    @DisplayName("Tests for comments.")
    class TestComments {

        @DisplayName("When newly created ForumUser comments on an existing post, " +
                "then getCommentsQuantity() should return 1.")
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");

            //When
            forumUser.addComment(forumPost, "mrsmith", "Thank you all for the good words");

            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

        @DisplayName("When a created comment gets added to the ForumUser," +
                "then a comment retrieved via getter should be same as the comment created earlier.")
        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");
            ForumComment forumComment = new ForumComment(forumPost, "Thank you all fo the good words",
                    "mrsmith");
            forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());

            //When
            ForumComment retrievedComment = forumUser.getComment(0);

            //Then
            Assertions.assertEquals(forumComment, retrievedComment);
        }

        @DisplayName("When a created comment gets removed, but is not added to the ForumUser, then return false.")
        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");
            ForumComment forumComment = new ForumComment(forumPost, "Thank you all fo the good words",
                    "mrsmith");

            //When
            boolean result = forumUser.removeComment(forumComment);

            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("When an only comment gets removed from the ForumUser," +
                "then return true and change CommentQuantity to 0.")
        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost forumPost = new ForumPost("Hello everyone, this is my first contribution here!",
                    "mrsmith");
            ForumComment forumComment = new ForumComment(forumPost, "Thank you all fo the good words",
                    "mrsmith");
            forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(forumComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }

    }
}
