/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep27_addition_exception;

/**
 *
 * @author J2EE-33
 */
public class Exception {

    public static void main(String[] args) {
        try {
            //int suma = 0;
            int sumb = 0;
            //int [] a = new int[]{1,2,3,4,5};
            
            args = new String[4];
            args[0] = "1";
            args[1] = "2";
            args[2] = "3";
            args[3] = "4";
            
            //String [] args = {"1","2"};
            for (String arg : args) {
                sumb += Integer.parseInt(arg);
                //sumb += a[i];
            }
            //System.out.println("Sum = " + suma);
            System.out.println("Sum = " + sumb);
            
        } catch (NumberFormatException e) {
            System.out.println("One of the command line arguments is not an integer.");
        }
    }
}
