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
import java.util.Scanner;

public class DefineSumofPositiveNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int sum = 0, x = 0;
        while (true) {
            x = sc.nextInt();
            if (x > 0) {
                sum += x;

            } else if (x < 0) {
                break;
            }
        }
        System.out.println("Sum : " + sum);
    }
}
