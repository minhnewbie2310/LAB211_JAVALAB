/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybubblesort;
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
        int[] a = new int[0];
        BubbleSort b = new BubbleSort();
        //loop until user want to exit
        while (true) {
            int choice = b.menu();
            switch (choice) {
                case 1:
                    a = b.inputValueOfArray();
                    break;
                case 2:
                    b.sortArrayAscending(a);
                    break;
                case 3:
                    b.sortArrayDescending(a);
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
