import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private List<String> submittedAssignments;

    public Student(String id) {
        this.id = id;
        this.submittedAssignments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(String assignmentDetails) {
        submittedAssignments.add(assignmentDetails);
    }

    public List<String> getSubmittedAssignments() {
        return submittedAssignments;
    }
}
