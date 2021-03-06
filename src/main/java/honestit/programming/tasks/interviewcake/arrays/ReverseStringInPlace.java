package honestit.programming.tasks.interviewcake.arrays;

public class ReverseStringInPlace {

    public static char[] reverse(char[] str) {
        if (str.length <= 1) {
            return str;
        }
        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            char left = str[i];
            char right = str[j];
            str[i] = right;
            str[j] = left;
        }

        return str;
    }
}
