package main.java.com.company;

import java.util.ArrayList;

/**
 * This class can be used to declare different methods based on the business requirements
 */
public class BusinessRequirements {

    ArrayList <String> wordList;

    BusinessRequirements(ArrayList<String> wordList){
        this.wordList=wordList;
    }

    /**
     * This will check the first letter of the string and if it satisfies the condition will increment
     * the counter and return it.
     * @return          Number of words/strings which start with m or M
     */
    public int checkFirstLetter (){
        int count = 0;
        for (String i:wordList) {
            if (i.charAt(0)=='m'||i.charAt(0)=='M') {
                count++;
            }
        }
        System.out.println(count+" words start with m or M.");
        return count;
    }

    /**
     * This function will check the string length and return a list of words > 5.
     * @return          List of Strings which are > 5
     */
    public ArrayList<String> checkWordLength(){
        ArrayList<String> temp = new ArrayList<>();
        for (String s:wordList) {
            if (s.length()> 5)
                temp.add(s);
        }
        System.out.println("Words longer than 5 characters are:");
        for (String s: temp)
            System.out.println(s);

        return temp;
    }
}
