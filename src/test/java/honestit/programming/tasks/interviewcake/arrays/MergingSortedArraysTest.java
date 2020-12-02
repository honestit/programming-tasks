package honestit.programming.tasks.interviewcake.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("nullArrays")
    @DisplayName("should throw expection when any array is null")
    void shouldThrowExceptionWhenAnyArraysIsNull(int[][] arrays) {
        assertThrows(IllegalArgumentException.class, () -> MergingSortedArrays.mergeSortedArrays(arrays[0], arrays[1]));
    }

    static Stream<int[][]> nullArrays() {
        int[][] bothNulls = new int[][] {
                null, null
        };
        int[][] firstNull = new int[][] {
                null, {}
        };
        int[][] secondNull = new int[][] {
                {}, null
        };
        return Stream.of(bothNulls, firstNull, secondNull);

    }



}