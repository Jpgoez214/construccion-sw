/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto6;

/**
 *
 * @author 57301
 */
public class Punto6 {

    public static void main(String[] args) {
        
        int[] vector1 = {1, 3, 5, 7, 2, 4, 6, 8};
        char[] vector2 = {'A', 'C', 'E', 'G', 'B', 'D', 'F', 'H'};

      
        String[][] matrix = new String[8][2];

        
        for (int i = 0; i < 8; i++) {
            matrix[i][0] = String.valueOf(vector1[i]); 
            matrix[i][1] = String.valueOf(vector2[i]); 
        }

        
        for (int i = 0; i < 4; i++) { 
            System.out.println(matrix[i][1] + matrix[i][0] + matrix[i+4][1] + matrix[i+4][0]); 
        }
    }
}
