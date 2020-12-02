package honestit.programming.tasks.interviewcake.hashes;

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

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
