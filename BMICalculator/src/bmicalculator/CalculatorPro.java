/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

/**
 *
 * @author User
 */
public class CalculatorPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorFunc func = new CalculatorFunc();
        while (true) {
            int choice = func.mennu();
            switch (choice) {
                case 1:
                    func.normalCalculator();
                    break;
                case 2:
                    func.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
