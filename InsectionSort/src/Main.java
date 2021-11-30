/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int n = i.inputSizeOfArray();
        int[] a = i.inputValueOfArray(n);
        i.sortArrayByInsectionSort(a);
        i.print(a);
    }
}
