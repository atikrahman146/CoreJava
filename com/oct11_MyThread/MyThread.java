/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct11_MyThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread started running...");
        int i = 0;
        while (true) {
            System.out.println("Result: " + i++);
            if (i == 10) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
