/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author 57301
 */
public class Punto17 {

    public static void main(String[] args) {
      
        Random random = new Random(); 
        Integer[] vector = new Integer[7];
        for (int i = 0; i < 7; i++) { 
            vector[i] = random.nextInt(100); 
        }
       
        Integer[] even = Arrays.stream(vector).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        Integer[] odd = Arrays.stream(vector).filter(n -> n % 2 != 0).toArray(Integer[]::new);

        Arrays.sort(even);
        
        Arrays.sort(odd, Comparator.reverseOrder());

        Integer[] result = new Integer[vector.length];
        System.arraycopy(even, 0, result, 0, even.length);
        System.arraycopy(odd, 0, result,even.length , odd.length);
     
        System.out.println(Arrays.toString(result));
    }
}
