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
public class CalculateInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        float p = sc.nextFloat();
        System.out.println("Enter Rate:");
        float r = sc.nextFloat();
        System.out.println("Enter Time in year:");
        float n = sc.nextFloat();

        float intrst = calcInterest(p, n, r);
        float total = intrst + p;

        System.out.println("Principle " + p
                + " Rate %:" + r
                + " Year: " + n
                + " Interest: " + calcInterest(p, n, r)
                + " Total: " + total);
    }

    public static float calcInterest(float principle, float time, float rate) {
        float interest = (principle + rate + time) / 100;
        return interest;
    }
    
    public static int getMinValue(int[] args) {
        int minVal = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i]< minVal) {
                minVal = args[i];
            }
        }
        return minVal;
    }

}
