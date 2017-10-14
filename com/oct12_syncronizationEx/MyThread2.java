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
public class MyThread2 extends Thread {

    SynchronizationEx1 t;

    public MyThread2(SynchronizationEx1 t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}
