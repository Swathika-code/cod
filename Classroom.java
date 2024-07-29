import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private String name;
    private Map<String, Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new HashMap<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String addStudent(String studentId) {
        if (!students.containsKey(studentId)) {
            students.put(studentId, new Student(studentId));
            return "Student " + studentId + " has been enrolled in " + name + ".";
        } else {
            return "Student " + studentId + " is already enrolled in " + name + ".";
        }
    }

    public String scheduleAssignment(String assignmentDetails) {
        assignments.add(new Assignment(assignmentDetails));
        return "Assignment for " + name + " has been scheduled.";
    }

    public String submitAssignment(String studentId, String assignmentDetails) {
        if (students.containsKey(studentId)) {
            students.get(studentId).submitAssignment(assignmentDetails);
            return "Assignment submitted by Student " + studentId + " in " + name + ".";
        } else {
            return "Student " + studentId + " is not enrolled in " + name + ".";
        }
    }
}
