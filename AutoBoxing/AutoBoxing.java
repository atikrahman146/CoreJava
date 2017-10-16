/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

/**
 *
 * @author J2EE-33
 */
public class AutoBoxing {
    private double balance = 0.0;
    private double income = 0.0;
    private double expense = 0.0;
    
    public double addBalance(double income){
        balance += income;
        return balance;
    }
    
    public double doExpense(double salary){
        balance -= expense;
        return balance;
    }
    
}
