class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println("Manager is conducting a meeting");
    }
}
 class Main {

    public static void main(String[] args) {

        // Polymorphic Array
        Employee[] employees = {
                new Developer(),
                new Manager()
        };

        for (Employee e : employees) {

            e.work();

            if (e instanceof Developer) {
                Developer dev = (Developer) e;
                dev.writeCode();
            }

            if (e instanceof Manager) {
                Manager mgr = (Manager) e;
                mgr.conductMeeting();
            }
        }
    }
}