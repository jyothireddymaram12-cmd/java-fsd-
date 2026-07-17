import java.util.HashMap;
import java.util.Scanner;

class StudentDatabase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();

        // 90 Student Records
        for (int i = 1; i <= 90; i++) {
            students.put("Student" + i, 1000 + i);
        }

        while (true) {
            System.out.println("\n===== STUDENT DATABASE SYSTEM =====");
            System.out.println("1. Display All Students");
            System.out.println("2. Search Student");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Update Student ID");
            System.out.println("6. Total Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nStudent Records:");
                    for (String name : students.keySet()) {
                        System.out.println(name + " -> " + students.get(name));
                    }
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    String search = sc.nextLine();

                    if (students.containsKey(search)) {
                        System.out.println("Student ID: " + students.get(search));
                    } else {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    students.put(name, id);
                    System.out.println("Student Added Successfully.");
                    break;

                case 4:
                    System.out.print("Enter Student Name to Remove: ");
                    String remove = sc.nextLine();

                    if (students.containsKey(remove)) {
                        students.remove(remove);
                        System.out.println("Student Removed Successfully.");
                    } else {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student Name: ");
                    String update = sc.nextLine();

                    if (students.containsKey(update)) {
                        System.out.print("Enter New ID: ");
                        int newId = sc.nextInt();
                        students.put(update, newId);
                        System.out.println("Student ID Updated.");
                    } else {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}