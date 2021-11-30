/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class InsertionSort {
    public static final Scanner in = new Scanner(System.in);

    //check user input a number integer
    public int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
//allow user input number of array

    public int inputSizeOfArray() {
        System.out.print("Enter number of array: ");
        int n = checkInputInt();
        return n;
    }
    //allow user input value of array

    public int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInputInt();
        }
        return a;
    }

    //sort array by bubble sort
    public void sortArrayByInsectionSort(int[] a) {
        int len = a.length;
        System.out.print("Unsorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println();
    }

    //display array after sort
    public void print(int[] a) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
