package javaexamples;

import java.util.Arrays; 

public class arraycommon {

public static void main(String[] args) 
    {
      int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10}; //array 1
      int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0}; //array 2
 
       System.out.println("Array1 : "+Arrays.toString(array1)); //printing array 1
       System.out.println("Array2 : "+Arrays.toString(array2)); //printing array 2
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j])) //checking the common elements and printing them.
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}