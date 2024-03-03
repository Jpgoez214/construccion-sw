/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 57301
 */
public class Punto8 {

    public static void main(String[] args) {
        
        Random random = new Random(); 
        Integer[] vector1 = new Integer[9]; 
        Integer[] vector2 = new Integer[11]; 
        for (int i = 0; i < 9; i++) { 
            vector1[i] = random.nextInt(10); 
        }
        for (int i = 0; i < 11; i++) { 
            vector2[i] = random.nextInt(10); 
        }

        List<Integer> list1 = new ArrayList<>(Arrays.asList(vector1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(vector2));

        List<Integer> common = new ArrayList<>();
       
        for (Integer num : list1) {
            if (list2.contains(num)) {
                common.add(num); 
            }
        }
       common.sort(null);
       System.out.println(common);
    }
}
