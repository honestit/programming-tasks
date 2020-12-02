package honestit.programming.tasks.interviewcake.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Reverse string in place test cases")
class ReverseStringInPlaceTest {

    @Test
    @DisplayName("should reverse empty array")
    void shouldReverseEmptyArray() {
        char[] emptyArray = new char[0];

        char[] result = ReverseStringInPlace.reverse(emptyArray);

        assertArrayEquals(emptyArray, result, "Empty array was not properly reversed");
    }

    @Test
    @DisplayName("should reverse array of length one")
    void shouldReverseArrayOfLengthOne() {
        char[] str = {'a'};

        char[] result = ReverseStringInPlace.reverse(str);

        assertArrayEquals(str, result, "One char array was not properly reversed");
    }

    @Test
    @DisplayName("should reverse even length array")
    void shouldReverseEvenLengthArray() {
        char[] str = {'a','b','c','d'};

        char[] result = ReverseStringInPlace.reverse(str);

        char[] expected = {'d','c','b','a'};
        assertArrayEquals(expected, result, "Even length array was not properly reversed");
    }

    @Test
    @DisplayName("should reverse odd length array")
    void shouldReverseOddLengthArray() {
        char[] str = {'a','b','c','d','e'};

        char[] result = ReverseStringInPlace.reverse(str);

        char[] expected = {'e','d','c','b','a'};
        assertArrayEquals(expected, result, "Odd length array was not properly reversed");
    }

}