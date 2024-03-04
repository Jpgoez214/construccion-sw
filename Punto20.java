/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto20;

import java.util.Random;

/**
 *
 * @author 57301
 */
public class Punto20 {

    public static void main(String[] args) {
        double[][] grades = new double[24][6]; 
        Random random = new Random();
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 6; j++) {
                grades[i][j] = random.nextDouble() * 5;
            }
        }

        // Calculate and print the average grade of each student
        for (int i = 0; i < 24; i++) {
            double sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += grades[i][j];
            }
            double average = sum / 6;
            System.out.println("The average grade of student " + (i+1) + " is: " + average);
        }
        for (int j = 0; j < 6; j++) {
            int passed = 0, failed = 0;
            for (int i = 0; i < 24; i++) {
                if(grades[i][j] >=3) { // Change the passing criterion to 3 or more
                    passed++;
                } else {
                    failed++;
                }
            }
            
            System.out.println("In subject " + (j+1) + ", " + passed +
                               " students passed and " + failed +
                               " students failed.");
        }

         // Calculate and print the average grade of each subject
         for(int j=0;j<6;j++){
             double total=0;
             for(int i=0;i<24;i++){
                 total+=grades[i][j];
             }
             double averageSubject=total/24;
             System.out.println("The average grade for subject "+(j+1)+" is: "+averageSubject);
         }
    }
}
