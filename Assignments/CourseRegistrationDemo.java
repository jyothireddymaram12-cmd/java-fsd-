import java.util.ArrayList;

class Course {

    private String courseCode;
    private String courseName;
    private int courseCredits;

    public Course(String courseCode, String courseName, int courseCredits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public void displayCourse() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Credits : " + courseCredits);
        System.out.println("---------------------------");
    }
}

class CourseRegistrationSystem {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName() + " added successfully.");
    }

    public void removeCourse(String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                courses.remove(c);
                System.out.println("Course removed successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("\nRegistered Courses");
        System.out.println("==================");

        for (Course c : courses) {
            c.displayCourse();
        }
    }

    public void findCourse(String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                System.out.println("Course Found");
                c.displayCourse();
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void calculateTotalCredits() {
        int total = 0;

        for (Course c : courses) {
            total += c.getCourseCredits();
        }

        System.out.println("Total Credits : " + total);
    }
}

public class CourseRegistrationDemo {

    public static void main(String[] args) {

        CourseRegistrationSystem system = new CourseRegistrationSystem();

        Course c1 = new Course("CS101", "Java Programming", 4);
        Course c2 = new Course("CS102", "Python Programming", 3);
        Course c3 = new Course("CS103", "Data Structures", 5);

        system.addCourse(c1);
        system.addCourse(c2);
        system.addCourse(c3);

        System.out.println();

        system.displayCourses();

        System.out.println();

        system.findCourse("CS102");

        System.out.println();

        system.removeCourse("CS102");

        System.out.println();

        system.displayCourses();

        System.out.println();

        system.calculateTotalCredits();

        System.out.println();

        c1.setCourseName("Advanced Java");
        c1.setCourseCredits(6);

        System.out.println("Updated Course Details");
        System.out.println("Course Code : " + c1.getCourseCode());
        System.out.println("Course Name : " + c1.getCourseName());
        System.out.println("Course Credits : " + c1.getCourseCredits());
    }
}