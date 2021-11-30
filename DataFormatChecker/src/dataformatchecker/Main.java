/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataformatchecker;

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
        Validation v = new Validation();
        System.out.print("Phone number: ");
        String phone = v.checkInputPhone();
        System.out.print("Date: ");
        String date = v.checkInputDate();
        System.out.print("Email: ");
        String email = v.checkInputEmail();
    }
    
}
