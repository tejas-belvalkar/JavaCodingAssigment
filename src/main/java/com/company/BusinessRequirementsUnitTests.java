package main.java.com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessRequirementsUnitTests {

    BusinessRequirements businessRequirements = new BusinessRequirements(new ArrayList<>(Arrays.asList("apple","banana","mango")));

    @Test
    void checkWordLength() {
        ArrayList<String> expectedOutput = new ArrayList<>(List.of("banana"));
        ArrayList <String> functionOutput = businessRequirements.checkWordLength();
        assertArrayEquals(functionOutput.toArray(),expectedOutput.toArray());
    }

    @Test
    void checkFirstLetter() {
        int expectedOutput = 1;
        int functionOutput = businessRequirements.checkFirstLetter();
        assertEquals(expectedOutput,functionOutput);
    }

}