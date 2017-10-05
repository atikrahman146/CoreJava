/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_exam;

/**
 *
 * @author J2EE-33
 */
public class CheckedException {
    public static void main(String[] args) {
        try {
            
            int sum = 0;
            String[] a = {"1","2","3","4","five"};
            
            for (String a1 : a) {
                sum += Integer.parseInt(a1);
            }
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("One of the command line arguments is not an integer.");
        }
    }
}
