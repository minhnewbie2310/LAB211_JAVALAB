/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnacci;

/**
 *
 * @author User
 */
public class FiboCreator {
    public static int fibonnaciHelper(int term, int lower, int higher) {
        if (term < 2) {
            return higher;
        }
        System.out.print(higher + " ");
        return fibonnaciHelper(term - 1, higher, higher + lower);
    }
}
