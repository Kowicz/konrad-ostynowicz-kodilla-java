package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        //testing simpleUser
        System.out.println("\n--TESTING simpleUser--\n");
        System.out.println("TESTING constructor");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("OK - constructor test passed");
        } else {
            System.out.println("NOT OK - constructor test failed");
        }


        //testing simpleCalculator
        System.out.println("\n--TESTING simpleCalculator--\n");
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        //adding test
        System.out.println("TESTING adding");
        int addingResult = simpleCalculator.add(7, 24);

        if (addingResult == 7 + 24) {
            System.out.println("OK - addition test passed");
        } else {
            System.out.println("NOT OK - addition test failed");
        }

        //subtracting test
        System.out.println("\nTESTING subtracting");
        int subtractingResult = simpleCalculator.subtract(49, 12);

        if (subtractingResult == 49 - 12) {
            System.out.println("OK - subtraction test OK");
        } else {
            System.out.println("NOT OK - subtraction test failed");
        }
    }
}
