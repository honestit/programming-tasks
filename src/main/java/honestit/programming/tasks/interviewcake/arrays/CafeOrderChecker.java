package honestit.programming.tasks.interviewcake.arrays;

public class CafeOrderChecker {

    public static boolean firstInFirstOut(int[] serviceOrder, int[] takeOut, int[] ateIn) {
        if (serviceOrder.length == 0 && takeOut.length == 0 && ateIn.length == 0) {
            return true;
        }
        if (serviceOrder.length != takeOut.length + ateIn.length) {
            return false;
        }
        return false;
    }
}
