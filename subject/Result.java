/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

/**
 *
 * @author J2EE-33
 */
public class Result {
    public static void main(String[] args) {
        Subject java = new Subject("java", 80);
        
        System.out.println(java.getSubject() + " " + java.getMarks() + " " + java.getStatus());
    }
            
}
