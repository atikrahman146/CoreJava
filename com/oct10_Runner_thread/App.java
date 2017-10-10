/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct10_Runner_thread;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Urmi u = new Urmi();
        Thread t1 = new Thread(u);

        Uncle un = new Uncle();
        Thread t2 = new Thread(un);

        t1.setPriority(5);
        t1.start();
        t1.setName("Urmi Thread");
        
        t2.start();
        t2.setName("Uncle Thread");
        t2.setPriority(10);
        t1.wait(1000);
        
        System.out.println("Urmi thread name:" + t1.getName());
        System.out.println("Uncle thread name:" + t2.getName());
    }
}
