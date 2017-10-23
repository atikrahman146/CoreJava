/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author J2EE-33
 */
public class ArraySort {

    static int[][] a = {{10, 15, 12}, {84, 14, 54}};

    public static void main(String[] args) {

        sortingArray(a);

    }

    public static void sortingArray(int[][] args) {
        for (int[] aa : args) {
            Arrays.sort(aa);
            for (int b : aa) {

                System.out.print(b + " " );
            }
            System.out.println();
        }
    }
}
