/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

/**
 *
 * @author Ayaaz
 */
import java.util.*;

public class JavaEvidence {

    public static void main(String[] args) {
        int data[] = new int[10];
        Scanner scn = new Scanner(System.in);

        int loc = 0;
        do {
            System.out.println("Enter number");
            int n = scn.nextInt();
            if (n < 0) {
                break;
            }
            data[loc++] = n;
        } while (loc < 10);

        int sum = 0;
        for (int d : data) {
            sum += d;
        }
        System.out.println("sum" + sum);

    }
}
