package com.oct15_ExamPractice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class TestAssertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        
        int value = sc.nextInt();
        assert value >= 18 : "not valid";
        
        System.out.println("Age: " + value);
    }
}
