/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class MaxMinValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        //System.out.println("Number:" + arraySort(arr));
        arraySort(arr);
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
    
    public static int getMin(int[] args) {
        int a = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < a) {
                a = args[i];
            }
        }
        return a;
    }
    
    public static int minSort(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    public static int maxSort(int[] a){
        Arrays.sort(a);
        return a[a.length - 1];
    }
    public static void arraySort(int[] a){
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    
}
