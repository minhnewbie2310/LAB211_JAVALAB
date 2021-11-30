/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BubbleSort b = new BubbleSort();
        int n = b.inputSizeOfArray();
        int[] a = b.inputValueOfArray(n);
        b.sortArrayByBubbleSort(a);
        b.print(a);
    }
    
}
