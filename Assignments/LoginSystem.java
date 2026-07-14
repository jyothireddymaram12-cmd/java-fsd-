class LoginSystem {
    public static void main(String args[]) {

        try {
            int pin = 1234;

            if (pin != 5678) {
                throw new Exception("Incorrect PIN");
            }

            System.out.println("Login Successful");
        }

        catch (Exception e) {
            System.out.println("Login Failed!");
            System.out.println(e.getMessage());
        }

        System.out.println("Thank you for using the Login System.");
    }
}