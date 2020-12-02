package honestit.programming.tasks.interviewcake.arrays;

public class ReverseWords {

    public static char[] reverseWords(char[] str) {
        if (str.length <= 1) {
            return str;
        }

        int lastSeparatorIndex = -1;
        char separtor = ' ';

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == separtor) {
                for (int j = lastSeparatorIndex + 1; j < i; j++) {
                    char left = str[j];
                    char right = str[str.length - 1 - j];
                    str[j] = right;
                    str[str.length - 1 - j] = left;
                }
                lastSeparatorIndex = i;
            }
        }

        return str;
    }
}
