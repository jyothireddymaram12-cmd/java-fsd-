import java.util.Date;

// Parent Class
class Student {
    protected String studentId;
    protected String studentName;
    protected String admissionDate;

    // Parent Constructor
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.admissionDate = new Date().toString();

        System.out.println("Student Registered: " + studentId);
    }

    // Parent Method
    public double calculateScholarship() {
        return 5000;
    }

    public void displayStudent() {
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + studentName);
        System.out.println("Admission Date  : " + admissionDate);
    }
}

// Child Class
class GraduateStudent extends Student {
    protected String course;

    // Child Constructor
    public GraduateStudent(String studentId, String studentName, String course) {
        super(studentId, studentName);

        this.course = course;

        System.out.println("Course          : " + course);
    }

    @Override
    public double calculateScholarship() {

        double scholarship = super.calculateScholarship() + 3000;

        System.out.println("Graduate Scholarship : $" + scholarship);

        return scholarship;
    }

    @Override
    public void displayStudent() {

        super.displayStudent();

        System.out.println("Course          : " + course);
    }
}

// Grandchild Class
class ResearchStudent extends GraduateStudent {
    private String researchTopic;

    // Grandchild Constructor
    public ResearchStudent(String studentId, String studentName, String course, String researchTopic) {
        super(studentId, studentName, course);

        this.researchTopic = researchTopic;

        System.out.println("Research Topic  : " + researchTopic);
    }

    @Override
    public double calculateScholarship() {

        double scholarship = super.calculateScholarship() + 2000;

        System.out.println("Research Scholarship : $" + scholarship);

        return scholarship;
    }

    @Override
    public void displayStudent() {

        super.displayStudent();

        System.out.println("Research Topic  : " + researchTopic);
    }
}

// Main Class
public class StudentApp {
    public static void main(String[] args) {

        // Object Creation
        ResearchStudent student = new ResearchStudent(
                "STU101",
                "Jyothi",
                "Cyber Security",
                "Network Security");

        student.displayStudent();
        student.calculateScholarship();
    }
}