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
public class MaxValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println("Max number:" + getMaxValue(arr));
    }

    public static int getMaxValue(int[] args) {
        int minVal = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > minVal) {
                minVal = args[i];
            }
        }
        return minVal;
    }
}
