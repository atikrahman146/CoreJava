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
public class EmailValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = sc.nextLine();

        int dotpos = email.indexOf(".");
        int atpos = email.indexOf("@");

        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}
