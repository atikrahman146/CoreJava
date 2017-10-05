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
public class Account implements Balance{
    private double priorBalance = 500000;
    private double a;

    public Account() {
    
    }
    
    @Override
    public void depositBalance(double a) {
        priorBalance += a; 
    }

    @Override
    public void withdrawBalance(double a) {
        priorBalance -= a; 
    }

    @Override
    public double checkBalance() {
        return priorBalance;
    }
}
