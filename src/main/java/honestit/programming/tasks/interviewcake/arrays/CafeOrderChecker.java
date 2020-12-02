package honestit.programming.tasks.interviewcake.arrays;

public class CafeOrderChecker {

    public static boolean firstInFirstOut(int[] serviceOrder, int[] takeOut, int[] ateIn) {
        if (serviceOrder.length == 0 && takeOut.length == 0 && ateIn.length == 0) {
            return true;
        }
        if (serviceOrder.length != takeOut.length + ateIn.length) {
            return false;
        }

        int indexOfTakeOut = 0;
        int indexOfAteIn = 0;

        for (int i = 0; i < serviceOrder.length; i++) {
            if (indexOfTakeOut >= takeOut.length) {
                if (serviceOrder[i] != ateIn[indexOfAteIn++]) {
                    return false;
                }
            } else if (indexOfAteIn >= ateIn.length) {
                if (serviceOrder[i] != takeOut[indexOfTakeOut++]) {
                    return false;
                }
            } else {
                if (serviceOrder[i] == takeOut[indexOfTakeOut]) {
                    indexOfTakeOut++;
                } else if (serviceOrder[i] == ateIn[indexOfAteIn]) {
                    indexOfAteIn++;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
