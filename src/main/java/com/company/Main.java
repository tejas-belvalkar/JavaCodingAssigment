package main.java.com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> wordList = new ArrayList<>();
        StringFunction stringFunction = new StringFunction();
        BusinessRequirements br;

        System.out.println("Randomly generated strings are:");
        /*
         * This for loop will create 5 randomly generated strings
         * and print them
         */

        for (int i=0;i<5;i++){
            wordList.add (stringFunction.randomStringGenerator());
        }

        br = new BusinessRequirements(wordList);

        br.checkWordLength();
        br.checkFirstLetter();
    }
}
