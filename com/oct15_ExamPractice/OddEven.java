/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class OddEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        OddEven.findNum(num);
    }
    static void findNum(int n){
        if (n/2==0) {
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " is Odd");
        }
    }
}
