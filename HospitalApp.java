import java.util.Date;

// Parent Class
class Patient {
    protected String patientId;
    protected double billAmount;
    protected String admissionDate;

    // Parent Constructor
    public Patient(String patientId, double billAmount) {
        this.patientId = patientId;
        this.billAmount = billAmount;
        this.admissionDate = new Date().toString();

        System.out.println("Patient Registered: " + patientId);
    }

    // Parent Method
    public double calculateBill() {
        return billAmount;
    }

    public void displayPatient() {
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Bill Amount    : $" + billAmount);
        System.out.println("Admission Date : " + admissionDate);
    }
}

// First Child Class
class InPatient extends Patient {
    private int roomDays;

    // Child Constructor
    public InPatient(String patientId, double billAmount, int roomDays) {
        super(patientId, billAmount);

        this.roomDays = roomDays;

        System.out.println("Room Days      : " + roomDays);
    }

    @Override
    public double calculateBill() {

        double totalBill = super.calculateBill() + (roomDays * 1000);

        System.out.println("InPatient Bill : $" + totalBill);

        return totalBill;
    }

    @Override
    public void displayPatient() {

        super.displayPatient();

        System.out.println("Room Days      : " + roomDays);
    }
}

// Second Child Class
class OutPatient extends Patient {
    private String doctorName;

    // Child Constructor
    public OutPatient(String patientId, double billAmount, String doctorName) {
        super(patientId, billAmount);

        this.doctorName = doctorName;

        System.out.println("Doctor Name    : " + doctorName);
    }

    @Override
    public double calculateBill() {

        double totalBill = super.calculateBill() + 500;

        System.out.println("OutPatient Bill : $" + totalBill);

        return totalBill;
    }

    @Override
    public void displayPatient() {

        super.displayPatient();

        System.out.println("Doctor Name    : " + doctorName);
    }
}

// Main Class
public class HospitalApp {
    public static void main(String[] args) {

        System.out.println("----- InPatient Details -----");

        InPatient patient1 = new InPatient("P101", 5000, 3);
        patient1.displayPatient();
        patient1.calculateBill();

        System.out.println();

        System.out.println("----- OutPatient Details -----");

        OutPatient patient2 = new OutPatient("P102", 1500, "Dr. Rao");
        patient2.displayPatient();
        patient2.calculateBill();
    }
}