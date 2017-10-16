/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class ArraySorting {

    public static void main(String[] args) {
        int[][] data = {{10, 50, 15, 30}, {25, 21, 30, 40}, {10, 50, 15, 30}, {25, 21, 30, 40}};

        System.out.println("Data Table");

        for (int[] d : data) {
            Arrays.sort(d);

            for (int a : d) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
