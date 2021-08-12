package main.java.com.company;

import java.util.Random;

public class StringFunction {

    /**
     * Generate a string starting with letters from a-z and of lengths between 2-9
     * @return generated string
     */

    String randomStringGenerator() {
        int leftLimit = 97; // ASCII code for letter 'a'
        int rightLimit = 122; // ASCII code for letter 'z'
        int targetStringLength = (int)Math.floor(Math.random()*9+2); //Variable string length between 2 & 9
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        return generatedString;
    }
}
