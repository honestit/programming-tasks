package honestit.programming.tasks.interviewcake.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Merging sorted arrays test cases")
class MergingSortedArraysTest {

    @Test
    @DisplayName("should merge empty arrays")
    void shouldMergeEmptyArrays() {
        int[] first = {};
        int[] second = {};

        int[] result = MergingSortedArrays.mergeSortedArrays(first, second);

        int[] expected = {};

        assertArrayEquals(expected, result);
    }

}