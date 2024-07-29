import java.util.HashMap;
import java.util.Map;

public class VirtualClassManager {
    private Map<String, Classroom> classrooms;

    public VirtualClassManager() {
        this.classrooms = new HashMap<>();
    }

    public String addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            return "Classroom " + className + " has been created.";
        } else {
            return "Classroom " + className + " already exists.";
        }
    }

    public String addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.addStudent(studentId);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }

    public String scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.scheduleAssignment(assignmentDetails);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }

    public String submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.submitAssignment(studentId, assignmentDetails);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String[] args = parts.length > 1 ? parts[1].split(" ", 2) : new String[0];

            switch (command) {
                case "add_classroom":
                    if (args.length == 1) {
                        System.out.println(addClassroom(args[0]));
                    } else {
                        System.out.println("Invalid command.");
                    }
                    break;
                case "add_student":
                    if (args.length == 2) {
                        System.out.println(addStudent(args[0], args[1]));
                    } else {
                        System.out.println("Invalid command.");
                    }
                    break;
                case "schedule_assignment":
                    if (args.length == 2) {
                        System.out.println(scheduleAssignment(args[0], args[1]));
                    } else {
                        System.out.println("Invalid command.");
                    }
                    break;
                case "submit_assignment":
                    if (args.length == 3) {
                        System.out.println(submitAssignment(args[0], args[1], args[2]));
                    } else {
                        System.out.println("Invalid command.");
                    }
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
