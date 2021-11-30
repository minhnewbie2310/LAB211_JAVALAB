/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryprogram;

import java.util.HashMap;

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
        DictionaryManager Manager = new DictionaryManager();
        HashMap<String, String> hm = new HashMap<>();
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addNewWord(hm);
                    break;
                case 2:
                    Manager.deleteWord(hm);
                    break;
                case 3:
                    Manager.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
    }
    

