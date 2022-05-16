package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String poem1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String poem2 = "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        String poem3 = "Ut enim ad minim veniam";
        String poem4 = "Quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";

        poemBeautifier.beautify(poem1, String::toUpperCase);
        poemBeautifier.beautify(poem2, str -> "ABC_" + str + "_ABC");

        //changing lowercase letters to uppercase and uppercase to lowercase
        poemBeautifier.beautify(poem3, str -> {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    sb.append((char) (str.charAt(i) + ('a' - 'A')));
                } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    sb.append((char) (str.charAt(i) - ('a' - 'A')));
                } else {
                    sb.append(str.charAt(i));
                }

            }
            return sb.toString();

        });

        //reversing given string
        poemBeautifier.beautify(poem4, str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        });

    }
}
