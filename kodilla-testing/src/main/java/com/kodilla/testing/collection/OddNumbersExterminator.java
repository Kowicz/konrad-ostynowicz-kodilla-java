package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    //Eliminate odd numbers from given Integer list
    //Creates and returns new list in case of receiving immutable list
    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> newNumbers = new ArrayList<>(numbers);

        newNumbers.removeIf(number -> number % 2 != 0);

        return newNumbers;
    }
}
