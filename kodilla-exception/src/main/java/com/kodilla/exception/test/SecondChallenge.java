package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5d) {
            throw new Exception();
        }
        return "Done!";
    }
}
