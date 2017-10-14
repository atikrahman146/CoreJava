/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct12_syncronizationEx;

/**
 *
 * @author J2EE-33
 */
public class SynchronizationEx1 {

    void printTable(int n) { // using synchronized here will make it synchronized method
        synchronized (this) { // this is synchronized block
            for (int i = 0; i <= 5; i++) {
                System.out.println(n * i);

                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
