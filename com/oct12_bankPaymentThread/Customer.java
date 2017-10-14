/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct12_bankPaymentThread;

/**
 *
 * @author J2EE-33
 */
public class Customer {

    double amount = 10000;

    synchronized void withdraw(double amount) {
        System.out.println("Going to withdraw...");

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("withdraw complete....");
    }
    
    
    synchronized void deposit(double amount ){
        System.out.println("Going to deposit");
        this.amount += amount;
        
        System.out.println("Deposit complete");
        
        notify();
    }
}
