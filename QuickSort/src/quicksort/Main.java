/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        QuickSort sorter = new QuickSort();
        
        System.out.print("Unsorted array: ");
        sorter.displayArray(array);
        
        System.out.println();
        
        sorter.quickSort(array, 0, length - 1);
        System.out.print("Sorted array: ");
        sorter.displayArray(array);
    }
    
}
