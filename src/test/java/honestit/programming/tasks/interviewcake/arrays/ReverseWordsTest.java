package honestit.programming.tasks.interviewcake.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Reverse words test cases")
class ReverseWordsTest {

    @Test
    @DisplayName("should reverse empty words")
    void shouldReverseEmptyWords() {
        char[] str = {};

        char[] result = ReverseWords.reverseWords(str);
        char[] expected = {};

        assertArrayEquals(expected, result, "Doesn't reverse empty words");
    }

    @Test
    @DisplayName("should leave empty word")
    void shouldReverseSingleWord() {
        char[] str = "abc".toCharArray();

        char[] result = ReverseWords.reverseWords(str);
        char[] expected = "abc".toCharArray();

        assertArrayEquals(expected, result, "Did reverse single word");
    }

}