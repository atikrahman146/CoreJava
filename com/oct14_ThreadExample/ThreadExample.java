/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct14_ThreadExample;

/**
 *
 * @author J2EE-33
 */
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        //final pc = new PC();
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
    }
 
    private static class pc {

        public pc() {
        }
        private static void produce() {

        }
        private static void consume() {

        }

    }
}
