package honestit.programming.tasks.interviewcake.arrays;

import honestit.programming.tasks.interviewcake.arrays.MergingRanges.Meeting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Merging ranges test cases")
class MergingRangesTest {

    @Test
    @DisplayName("should merge overlaping meetings")
    void shouldMergeOverlapingMeetings() {
        List<Meeting> meetings = List.of(
                Meeting.of(0, 1),
                Meeting.of(3, 5),
                Meeting.of(4, 8),
                Meeting.of(10, 12),
                Meeting.of(9, 10)
        );

        List<Meeting> result = MergingRanges.mergeMeetings(meetings);

        List<Meeting> expected = List.of(
                Meeting.of(0, 1),
                Meeting.of(3, 8),
                Meeting.of(9, 12)
        );

        assertEquals(expected, result, "Meetings were not merged properly");
    }

    @Test
    @DisplayName("should merge single meeting list")
    void shouldMergeSingleMeetingList() {
        List<Meeting> singleMeetingList = List.of(Meeting.of(1, 10));

        List<Meeting> result = MergingRanges.mergeMeetings(singleMeetingList);

        assertEquals(singleMeetingList, result, "Single meeting were not merged properly");
    }

}