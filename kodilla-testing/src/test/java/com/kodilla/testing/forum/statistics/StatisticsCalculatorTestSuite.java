package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Nested
    @DisplayName("Tests when number of users is 100.")
    class TestHundredUsers {

        @BeforeEach
        void beforeEach() {

            List<String> userNames = new ArrayList<>();

            for (int i = 0 ; i < 100; i++) {
                userNames.add("user" + i);
            }

            when(statisticsMock.userNames()).thenReturn(userNames);
        }

        @Nested
        @DisplayName("Tests when number of posts is 1000.")
        class TestThousandPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 1000;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is 1000 and number of users is 100, then average number of posts per user is 10.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(1000d / 100, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is 100, then average number of comments per user is 10.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(10d, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is 1000, then average number of comments per post is 1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1d, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is 100, then average number of comments per user is 1.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1d, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is 1000, then average number of comments per post is 0.1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(100d / 1000, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is 100, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is 1000, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }

        @Nested
        @DisplayName("Tests when number of posts is 100.")
        class TestHundredPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 100;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is 100 and number of users is 100, then average number of posts per user is 1.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(100d / 100, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is 100, then average number of comments per user is 10.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1000d / 100, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is 100, then average number of comments per post is 10.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1000d / 100, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is 100, then average number of comments per user is 1.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(100d / 100, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is 100, then average number of comments per post is 1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1d, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is 100, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is 100, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }

        @Nested
        @DisplayName("Tests when number of posts is 0.")
        class TestZeroPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 0;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is zero and number of users is 100, then average number of posts per user is zero.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(0, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is 100, then average number of comments per user is 10.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(10, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is 100, then average number of comments per user is 1.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(100d / 100, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is 100, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }
    }


    @Nested
    @DisplayName("Tests when number of users is 0.")
    class TestZeroUsers {

        @BeforeEach
        void beforeEach() {

            List<String> userNames = new ArrayList<>();

            when(statisticsMock.userNames()).thenReturn(userNames);
        }

        @Nested
        @DisplayName("Tests when number of posts is 1000.")
        class TestThousandPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 1000;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is 1000 and number of users is zero, then average number of posts per user is zero.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(0, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is 1000, then average number of comments per post is 1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1d, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is 1000, then average number of comments per post is 0.1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(100d / 1000, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is 1000, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }

        @Nested
        @DisplayName("Tests when number of posts is 100.")
        class TestHundredPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 100;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is 100 and number of users is zero, then average number of posts per user is zero.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(0, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is 100, then average number of comments per post is 10.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1000d / 100, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is 100, then average number of comments per post is 1.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(1d, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is 100, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }

        @Nested
        @DisplayName("Tests when number of posts is 0.")
        class TestZeroPosts {

            @BeforeEach
            void beforeEach() {

                int numberOfPosts = 0;

                when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
            }

            @DisplayName("When number of posts is zero and number of users is zero, then average number of posts per user is zero.")
            @Test
            void testAvgNumberOfPostsPerUserWithMock() {
                // Given
                StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                // When
                statisticsCalculator.calculateAdvStatistics(statisticsMock);

                // Then
                assertEquals(0, statisticsCalculator.getAvgNumberOfPostsPerUser());

//                forumStatistics.showStatistics();
            }

            @Nested
            @DisplayName("Tests when number of comments is 1000.")
            class TestThousandComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 1000;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 1000 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 1000 and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 100.")
            class TestHundredComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 100;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is 100 nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is 100 and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }

            @Nested
            @DisplayName("Tests when number of comments is 0.")
            class TestZeroComments {

                @BeforeEach
                void beforeEach() {

                    int numberOfComments = 0;

                    when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
                }

                @DisplayName("When number of comments is zero nad number of users is zero, then average number of comments per user is zero.")
                @Test
                void testAvgNumberOfCommentsPerUserWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerUser());

//                forumStatistics.showStatistics();
                }

                @DisplayName("When number of comments is zero and number of posts is zero, then average number of comments per post is zero.")
                @Test
                void testAvgNumberOfCommentsPerPostWithMock() {
                    // Given
                    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

                    // When
                    statisticsCalculator.calculateAdvStatistics(statisticsMock);

                    // Then
                    assertEquals(0, statisticsCalculator.getAvgNumberOfCommentsPerPost());

//                forumStatistics.showStatistics();
                }

            }
        }
    }

}
