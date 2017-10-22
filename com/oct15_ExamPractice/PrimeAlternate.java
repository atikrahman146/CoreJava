/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

/**
 *
 * @author J2EE-33
 */
public class PrimeAlternate {
    public static boolean isPrime(int num){
        if ( num > 2 && num%2 == 0 ) {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true; 
    }
    
    public static void main(String[] args) {
        isPrime(45);
    }
}
