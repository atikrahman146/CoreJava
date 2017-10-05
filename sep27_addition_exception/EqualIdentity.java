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
public class EqualIdentity {

    public static void main(String[] args) {
         String hello = "Hellow";
         String hell = "Hell" + "ow";
         
         if(hello == hell){
             System.out.println("Both are identically equal");
         }
         if(hello.equals(hell)){
             System.out.println("Both are equal");
         }
         
    }
}
