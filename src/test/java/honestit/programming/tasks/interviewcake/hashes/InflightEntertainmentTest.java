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

}