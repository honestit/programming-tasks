package honestit.programming.tasks.interviewcake.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cafe order checker test cases")
class CafeOrderCheckerTest {

    @Test
    @DisplayName("should return true on empty input")
    void shouldReturnTrueOnEmptyInput() {
        boolean result = CafeOrderChecker.firstInFirstOut(new int[]{}, new int[]{}, new int[]{});

        assertTrue(result);
    }

    @Test
    @DisplayName("should return false when service length is less than sum of orders")
    void shouldReturnFalseWhenServiceLengthIsLessThanSumOfOrders() {
        int[] services = new int[] {};
        int[] takeOut = new int[] {1};
        int[] ateIn = new int[] {2};

        boolean result = CafeOrderChecker.firstInFirstOut(services, takeOut, ateIn);

        assertFalse(result);
    }

    @Test
    @DisplayName("should return true when service is same order as takeOut and ateIn")
    void shouldReturnTrueWhenServiceIsSameOrderAsTakeOutAndAteIn() {
        int[] services = {17, 8, 12, 19, 24, 2};
        int[] takeOut = {17, 8, 24};
        int[] ateIn = {12, 19, 2};

        boolean result = CafeOrderChecker.firstInFirstOut(services, takeOut, ateIn);

        assertTrue(result);
    }

}