package honestit.programming.tasks.interviewcake.hashes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PalindromPermutationTest {

    @Test
    @DisplayName("should return true for single character string")
    void shouldReturnTrueForSingleCharacterString() {
        String str = "a";

        boolean result = PalindromPermutation.hasAnyPalindromPermutation(str);

        assertTrue(result);
    }

    @Test
    @DisplayName("should return true for string with two same characters")
    void shouldReturnTrueForStringsWithTwoSameCharacters() {
        String str = "aa";

        boolean result = PalindromPermutation.hasAnyPalindromPermutation(str);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "civic", "ivicc", "kajak", "ala"
    })
    @DisplayName("should return true for any string with no more than one char with odd occurrence")
    void shouldReturnTrueForAnyStringWithOddUniqueChars(String str) {
        boolean result = PalindromPermutation.hasAnyPalindromPermutation(str);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "civil", "livci", "ula", "ababab"
    })
    @DisplayName("should return false for any string with more than one char with odd occurrence")
    void shouldReturnFalseForAnyStringWithMoreThanOneCharWithOddOccurrence(String str) {
        boolean result = PalindromPermutation.hasAnyPalindromPermutation(str);

        assertFalse(result);

    }

}