package com.mycompany.taller;

import java.util.Scanner;

/**
 *
 * @author 57301
 */
public class Taller {

    public static void main(String[] args) {
         int[][] matrix = {{0,1,2,3},{4,5,6,7},{8,9,0,1},{2,3,4,5}};
        boolean[][] visible = new boolean[4][4]; // Matrix to track which numbers are visible
        int points = 0; // Player's points
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while (points < 10) { // The game continues until the player reaches 10 points
            System.out.println("Enter the coordinates of the first position (row column): ");
            int row1 = scanner.nextInt();
            int column1 = scanner.nextInt();

            System.out.println("Enter the coordinates of the second position (row column): ");
            int row2 = scanner.nextInt();
            int column2 = scanner.nextInt();

            // Show the values in the positions selected by the user
            System.out.println("You have selected the numbers " + matrix[row1][column1] + " and " + matrix[row2][column2]);

            if (matrix[row1][column1] == matrix[row2][column2]) { // If the numbers are equal
                System.out.println("It's a match!");
                points++; // Increase the player's points
                visible[row1][column1] = true; // Mark the first position as visible
                visible[row2][column2] = true; // Mark the second position as visible

                // Show the updated matrix with the visible numbers and the hidden ones with asterisks
                for(int i=0; i<4; i++) {
                    for(int j=0; j<4; j++) {
                        if(visible[i][j]) { // If the number is visible
                            System.out.print(matrix[i][j] + " "); // Show the number
                        } else { // If the number is hidden
                            System.out.print("* "); // Show an asterisk
                        }
                    }
                    System.out.println(); // Line break
                }

            } else { // If the numbers are different
                System.out.println("It's not a match.");
                // Show the matrix with the hidden numbers with asterisks
                for(int i=0; i<4; i++) {
                    for(int j=0; j<4; j++) {
                        System.out.print("* "); // Show an asterisk
                    }
                    System.out.println(); // Line break
                }
            }
        }
        System.out.println("Congratulations! You have won the game with " + points + " points."); // Final message
        scanner.close(); 
    }
}
