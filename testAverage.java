/*
PSEUDOCODE, JAVA CODE, AND OUTPUT
1. Import Scanner Class
2. Add Comments
3. Setup Variables 
4. Tell user to enter score 1
5. Tell user to enter score 2
6. Tell user to enter score 3
7. Add the 3 scores together
8. Show the output of the 3 scores added together
9. Display the 3 scores
*/

import java.util.Scanner; // Import that allows keyboard input
import javax.swing.JOptionPane; // Import that allows dialog boxes

public class testAverage {
    public static void main(String[] args) {
        int testScore1; // Variable to hold data for test score 1
        int testScore2; // Variable to hold data for test score 2
        int testScore3; // Variable to hold data for test score 3
        double averageTestScore; // Variable to hold data for average test score

        Scanner keyboard = new Scanner(System.in);

        // Get the input of the first test score
        System.out.print("Enter the first test score: ");
        testScore1 = keyboard.nextInt();

        // Get the input of the second test score
        System.out.print("Enter the second test score: ");
        testScore2 = keyboard.nextInt();

        // Get the input of the third test score
        System.out.print("Enter the third test score: ");
        testScore3 = keyboard.nextInt();

        // Add the 3 test scores together and get the average
        averageTestScore = (testScore1 + testScore2 + testScore3) / 3;

        keyboard.close(); // Close the keyboard input to make VSCode happy

        // Display the average of the 3 test scores in the terminal
        System.out.println("The average of the 3 test scores is: " + averageTestScore);

        // ALL DONE!
        JOptionPane.showMessageDialog(null, "All done!");
    }
}