package honestit.programming.tasks.interviewcake.hashes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InflightEntertainment {

    public static boolean areMoviesToWatch(int flightLength, int[] moviesLength) {

        Map<Integer, Integer> moviesUniqueLength = new HashMap<>();

        for (int movieLength : moviesLength) {
            if (movieLength >= flightLength) {
                // cannot watch two movies if length of any one is equal or greater than flight length
                continue;
            }
            moviesUniqueLength.merge(movieLength, 1, Integer::sum);
        }

        for (int movieLength : moviesLength) {
            if (movieLength >= flightLength) {
                continue;
            }
            int secondMovieLength = flightLength - movieLength;
            if (moviesUniqueLength.containsKey(secondMovieLength)) {
                if (secondMovieLength != movieLength) {
                    return true;
                }
                else if (moviesUniqueLength.get(secondMovieLength) > 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
