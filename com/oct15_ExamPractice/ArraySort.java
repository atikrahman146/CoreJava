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
public class ArraySort {

    static int[][] a = {{10, 15, 12}, {84, 14, 54}};

    public static void main(String[] args) {
        for (int[] d : a) {
            Arrays.sort(d);

            for (int n : d) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
