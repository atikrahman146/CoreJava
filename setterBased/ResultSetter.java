/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterBased;

/**
 *
 * @author J2EE-33
 */
public class ResultSetter {
    public static void main(String[] args) {
        SetterMethod methodshow = new SetterMethod();
        
        methodshow.setName("This is set by setter method");
        
        System.out.println("Result: " + methodshow.getName());
    }
}
