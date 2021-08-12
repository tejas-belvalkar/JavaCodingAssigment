package main.java.com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> wordList = new ArrayList<>();
        BusinessRequirements br;
        StringFunction stringFunction = () -> {
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
        };

        System.out.println("Randomly generated strings are:");
        /*
         * //This for loop will create 5 randomly generated strings
         */
        for (int i=0;i<5;i++){
            wordList.add (stringFunction.randomStringGenerator());
        }

        br = new BusinessRequirements(wordList);

        br.checkWordLength();
        br.checkFirstLetter();
    }
}
