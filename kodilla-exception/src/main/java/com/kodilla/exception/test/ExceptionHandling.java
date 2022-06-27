package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleSecondChallenge(double x, double y) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";

        try {
            result =secondChallenge.probablyWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Conditions was met and exception is thrown.");
        } finally {
            System.out.println(result);;
        }
    }

}
