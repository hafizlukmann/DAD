package dad;
import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number of marks
            System.out.print("How many marks do you want to insert? ");
            int numMarks = scanner.nextInt();

            double totalMarks = 0;

            // Loop to get marks from the user
            for (int i = 1; i <= numMarks; i++) {
                System.out.print("Please enter mark no " + i + ": ");
                double mark = scanner.nextDouble();
                totalMarks += mark;
                System.out.println("Mark: " + mark + " has been inserted.");
            }

            // Display the total marks
            System.out.println("Total marks is: " + totalMarks);

            System.out.print("Press any key to continue . . .");
            // Close the scanner
            scanner.close();

    }
}
