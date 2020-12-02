package honestit.programming.tasks.interviewcake.arrays;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
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
        // Lets make a copy so we won't change original order of meetings
        ArrayList<Meeting> meetingsCopy = new ArrayList<>(meetings);

        if (meetingsCopy.size() == 1) {
            return meetingsCopy;
        }

        // Lets sort meeting with startTime
        meetingsCopy.sort(Comparator.comparing(Meeting::getStartTime));

        // Lets merge meetings based on startTime being beforeTime of previous meeting
        List<Meeting> mergedMeetings = new ArrayList<>();

        Meeting meetingToAdd = meetingsCopy.get(0);
        for (int i = 1; i < meetingsCopy.size(); i++) {
            Meeting currentMeeting = meetingsCopy.get(i);
            // If meetings overlap we merge them into one meeting
            if (currentMeeting.getStartTime() <= meetingToAdd.getEndTime()) {
                meetingToAdd = Meeting.of(meetingToAdd.getStartTime(), currentMeeting.getEndTime());
            }
            // If meeting doesn't overlap we add lastMeetings and take new one as merging base
            else {
                mergedMeetings.add(meetingToAdd);
                meetingToAdd = currentMeeting;
            }
        }

        // At the end we add last meeting because it has nothing to merge it with
        mergedMeetings.add(meetingToAdd);
        return mergedMeetings;
    }
}
