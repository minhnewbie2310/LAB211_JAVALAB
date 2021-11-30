/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalbillscounter;

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
        BillCounter bc = new BillCounter();
        //allow user input input bill
        int[] bills = bc.inputBills();
        //allow user in put amount of wallet
        int wallet = bc.inputWallet();
        //print total of bill and result
        bc.printTotalAndResult(bills, wallet);
    }
    
}
