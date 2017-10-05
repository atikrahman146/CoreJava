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
public interface Balance {
    void depositBalance(double a);
    void withdrawBalance(double a);
    double checkBalance();
}
