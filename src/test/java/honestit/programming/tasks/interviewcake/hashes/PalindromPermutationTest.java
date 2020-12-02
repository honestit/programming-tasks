package honestit.programming.tasks.interviewcake.hashes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}