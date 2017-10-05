/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyJar;

/**
 *
 * @author J2EE-33
 */
public class MoneyJar {
    private String purpose;
    private double amount;
    private double target;
    private double surplus;
    
    // method conversion string to int
    public int getIntValue(String b){
        int c = Integer.parseInt(b);
        return c;
    } 
    
    public void add(double sum){
        amount = amount + sum;
        surplus = amount - target;
    }
}
