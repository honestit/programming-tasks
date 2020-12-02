package honestit.programming.tasks.interviewcake.hashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromPermutation {

    public static boolean hasAnyPalindromPermutation(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }

        HashMap<Character, Integer> occurrenceMap = new HashMap<>();
        for (char c : str.toCharArray()) {
             occurrenceMap.merge(c, 1, Integer::sum);
        }

        int oddOccurrences = 0;

        for (Character c : occurrenceMap.keySet()) {
            Integer occurences = occurrenceMap.get(c);
            if (occurences % 2 != 0) {
                oddOccurrences++;
            }
            if (oddOccurrences > 1) {
                return false;
            }
        }
        return true;
    }
}
