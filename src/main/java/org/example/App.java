package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Homework");
        int[] mas = {3,2,4,5,6};
        System.out.println(Arrays.toString(mas));
        Functions.bubbleSort(mas);
        System.out.println("Sorted mas");
        System.out.println(Arrays.toString(mas));
        Functions.binarySearch(mas, 5);
    }

    public static void outPut(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
