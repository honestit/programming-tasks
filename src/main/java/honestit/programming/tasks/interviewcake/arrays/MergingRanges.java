package honestit.programming.tasks.interviewcake.arrays;

import lombok.Data;

import java.util.List;

public class MergingRanges {

    @Data
    static class Meeting {

        private final int startTime;
        private final int endTime;

        public static Meeting of(int startTime, int endTime) {
            return new Meeting(startTime, endTime);
        }
    }

    public static List<Meeting> mergeMeetings(List<Meeting> meetings) {
        return List.of();
    }
}
