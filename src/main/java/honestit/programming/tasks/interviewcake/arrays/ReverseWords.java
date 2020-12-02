package honestit.programming.tasks.interviewcake.arrays;

public class ReverseWords {

    public static char[] reverseWords(char[] str) {
        if (str.length <= 1) {
            return str;
        }

        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            char left = str[i];
            char right = str[j];
            str[i] = right;
            str[j] = left;
        }

        int lastSeparator = -1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                for (int j = lastSeparator + 1, k = i - 1; j < k; j++, k--) {
                    char left = str[j];
                    char right = str[k];

                    str[j] = right;
                    str[k] = left;
                }
                lastSeparator = i;
            }
        }

        for (int i = lastSeparator + 1, j = str.length - 1; i < j; i++, j--) {
            char left = str[i];
            char right = str[j];

            str[i] = right;
            str[j] = left;
        }

        return str;
    }
}
