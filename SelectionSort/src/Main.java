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
        SelectionSort s = new SelectionSort();
        int n = s.inputSizeOfArray();
        int[] a = s.inputValueOfArray(n);
        s.sortArrayBySectionSort(a);
        s.print(a);
    }
}
