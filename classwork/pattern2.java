class pattern2 {
    public static void main(String[] args) {

        // Number of rows to print
        int rows = 4;

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}