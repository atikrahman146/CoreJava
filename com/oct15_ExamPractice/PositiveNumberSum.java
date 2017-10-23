package com.oct15_ExamPractice;

import java.util.Scanner;

public class PositiveNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        System.out.println("Enter number: ");
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        n[3] = sc.nextInt();
        System.out.println("Sum: " + calcNum(n));
    }

    public static int calcNum(int[] args) {
        int arg = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 0) {
                break;
            }else{
                arg += args[i];
            }
        }
        return arg;
    }
}
