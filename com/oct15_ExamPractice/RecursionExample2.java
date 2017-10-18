/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct15_ExamPractice;

/**
 *
 * @author J2EE-33
 */
public class RecursionExample2 {

    static int count = 0;

    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("hello " + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
