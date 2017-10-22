/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct14_primeNumber;

/**
 *
 * @author J2EE-33
 */
public class Fibonacci {

    public static void main(String[] args) {
        fibNum(100);
    }

    public static void fibNum(int x) {
        int a, b, c, d = 0;
        for (a = 0, b = 1, c = 0; c <= x; a = b, b = c, c = a + b) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
