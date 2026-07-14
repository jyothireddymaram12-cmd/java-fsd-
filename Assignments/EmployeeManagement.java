interface Employee {
    void addEmployee(String name);
    void displayEmployee();
}

interface Salary {
    double calculateSalary(double basic);
}

interface Loggable {
    void logActivity(String action);
}

class EmployeeManagement implements Employee, Salary, Loggable {

    String name;

    public void addEmployee(String name) {
        this.name = name;
        logActivity("Employee Added");
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }

    public double calculateSalary(double basic) {
        return basic + (basic * 0.20);
    }

    public void logActivity(String action) {
        System.out.println("Activity: " + action);
    }

    public static void main(String[] args) {

        EmployeeManagement e = new EmployeeManagement();

        e.addEmployee("Rahul");

        e.displayEmployee();

        System.out.println("Salary = ₹" + e.calculateSalary(30000));
    }
}