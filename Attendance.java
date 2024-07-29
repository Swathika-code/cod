import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private Map<String, Boolean> attendanceRecords;

    public Attendance() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(String studentId, boolean isPresent) {
        attendanceRecords.put(studentId, isPresent);
    }

    public Map<String, Boolean> getAttendanceRecords() {
        return attendanceRecords;
    }
}
