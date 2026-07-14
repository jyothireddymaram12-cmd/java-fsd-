class pattern1 {
    public static void main(String[] args) {

        // Number of rows and columns
        int rows = 4, cols = 6;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {

                // Print '*' for the border
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                }

                // Print space inside the rectangle
                else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}