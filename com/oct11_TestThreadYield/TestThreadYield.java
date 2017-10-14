/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct11_TestThreadYield;

/**
 *
 * @author J2EE-33
 */
public class TestThreadYield implements Runnable {

    Thread t;

    public TestThreadYield(String str) {
        t = new Thread(this, str);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName()
                        + " Yielding control..."
                );
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing");
    }
}
