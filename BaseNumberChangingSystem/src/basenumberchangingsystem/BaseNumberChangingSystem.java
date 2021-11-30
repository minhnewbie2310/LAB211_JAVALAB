/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basenumberchangingsystem;

/**
 *
 * @author User
 */
public class BaseNumberChangingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseChangingManager manager = new BaseChangingManager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    manager.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    manager.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    manager.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
