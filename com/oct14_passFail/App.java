/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct14_passFail;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you written mark: ");
        int writtenNumber = sc.nextInt();
        
        System.out.println("Enter you Evidence mark: ");
        int evidenceNumber = sc.nextInt();
        
        int total = writtenNumber + evidenceNumber;
        
        PassFail arif = new PassFail(writtenNumber, evidenceNumber);
        
        System.out.println(arif.result() + "Total marks: " + total + " Grade: " + arif.resultGrade());
    }
}
