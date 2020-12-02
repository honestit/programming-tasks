package honestit.programming.tasks.interviewcake.hashes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Inflight Entertainment test cases")
class InflightEntertainmentTest {

    @Test
    @DisplayName("should return true where there are exatly two different movies")
    void shouldReturnTrueWhereThereAreExactlyTwoDifferentMovies() {
        int flightLength = 10;
        int[] movies = {4,6};

        boolean result = InflightEntertainment.areMoviesToWatch(flightLength, movies);

        assertTrue(result);
    }

    @Test
    @DisplayName("should return false where tere are no two different movies")
    void shouldReturnFalseWhereThereAreNoTwoDiffrentMovies() {
        int flightLength = 10;
        int[] movies = {3, 4};

        boolean result = InflightEntertainment.areMoviesToWatch(flightLength, movies);

        assertFalse(result);
    }

    @Test
    @DisplayName("should return false where only one movie sum with itself")
    void shouldReturnFalseWhenOnlyOneMovieSumWithItself() {
        int flightLength = 10;
        int[] movies = {1,2,3,4,5};

        boolean result = InflightEntertainment.areMoviesToWatch(flightLength, movies);

        assertFalse(result);
    }

}