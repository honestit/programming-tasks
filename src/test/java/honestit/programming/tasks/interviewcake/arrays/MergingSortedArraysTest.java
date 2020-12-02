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

    @Test
    @DisplayName("should merge not empty sorted arrays")
    void shouldMergeNotEmptySortedArrays() {
        int[] first = {3, 4, 6, 10, 11, 15};
        int[] second = {1, 5, 8, 12, 14, 19};

        int[] result = MergingSortedArrays.mergeSortedArrays(first, second);

        int[] expected = {1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19};
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("emptyAndNotEmptyArrays")
    @DisplayName("should merge not empty with empty array")
    void shouldMergeNotEmptyWithEmptyArray(int[][] arrays) {
        int[] result = MergingSortedArrays.mergeSortedArrays(arrays[0], arrays[1]);

        int[] expected = {1,2,3,4,5,6};

        assertArrayEquals(expected, result);
    }

    static Stream<int[][]> emptyAndNotEmptyArrays() {
        int[][] firstNotEmpty = new int[][] {
                {1,2,3,4,5,6}, {}
        };
        int[][] secondNotEmpty = new int[][] {
                {}, {1,2,3,4,5,6}
        };
        return Stream.of(firstNotEmpty, secondNotEmpty);
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