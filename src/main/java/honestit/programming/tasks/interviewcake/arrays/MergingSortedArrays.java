package honestit.programming.tasks.interviewcake.arrays;

public class MergingSortedArrays {

    public static int[] mergeSortedArrays(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Arrays must be not null");
        }
        int[] merged = new int[first.length + second.length];

        int indexOfFirst = 0;
        int indexOfSecond = 0;

        for (int i = 0; i < merged.length; i++) {
            if (indexOfFirst >= first.length) {
                merged[i] = second[indexOfSecond++];
            }
            else if (indexOfSecond >= second.length) {
                merged[i] = first[indexOfFirst++];
            }
            else if (first[indexOfFirst] <= second[indexOfSecond]) {
                merged[i] = first[indexOfFirst++];
            }
            else {
                merged[i] = second[indexOfSecond++];
            }
        }

        return merged;
    }
}
