package honestit.programming.tasks.interviewcake.arrays;

public class ReverseWords {

    public static char[] reverseWords(char[] str) {
        if (str.length <= 1) {
            return str;
        }

        // Reverse all string
        reverseWords(str, -1, str.length);

        int lastSeparator = -1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                // Reverse string from last separator till next separator
                reverseWords(str, lastSeparator, i);
                lastSeparator = i;
            }
        }

        // Reverse last word
        reverseWords(str, lastSeparator, str.length);

        return str;
    }

    private static void reverseWords(char[] str, int wordStart, int wordEnd) {
        for (int j = wordStart + 1, k = wordEnd - 1; j < k; j++, k--) {
            char left = str[j];
            char right = str[k];

            str[j] = right;
            str[k] = left;
        }
    }
}
