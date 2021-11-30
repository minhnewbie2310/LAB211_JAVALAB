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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        FiboCreator fc = new FiboCreator();
        System.out.println("The 45 sequence fibonacci");
        fc.fibonnaciHelper(45, 1, 0);
    }
    
}
