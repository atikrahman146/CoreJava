/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct14_primeNumber;

import java.util.Scanner;

public class PrimeList {

    public static boolean findPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (m == 0 || n == 1) {
            //System.out.println("Number is not prime.");
            flag = 1;
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    //System.out.println("Number is not prime.");
                    flag = 1;
                    return false;
                }
            }
        }
        if (flag == 1) {
            return true;
        }
        return true;
    }

    public static void showPrimeList(int a, int b) {
        for (a = 0; a <= b; a++) {
            if (findPrime(a)) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        showPrimeList(1, 100);
    }

}
