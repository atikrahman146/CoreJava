/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep28_balance;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Account test = new Account();
        test.depositBalance(300000);
        test.withdrawBalance(600000);
        
        System.out.println("Balance: " + test.checkBalance());
    }
}
