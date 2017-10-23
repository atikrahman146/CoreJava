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
public class ArraySorting2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] num = new int[2][3];
        
        System.out.println("Row 1");
        System.out.println("Enter number");
        num[0][0] = scn.nextInt();
        num[0][1] = scn.nextInt();
        num[0][2] = scn.nextInt();
        
        System.out.println("Row 2");
        System.out.println("Enter number");
        num[1][0] = scn.nextInt();
        num[1][1] = scn.nextInt();
        num[1][2] = scn.nextInt();
        
        sortingArray(num);
    }

    public static void sortingArray(int[][] n) {
        for (int[] d : n) {
            Arrays.sort(d);

            for (int a : d) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
