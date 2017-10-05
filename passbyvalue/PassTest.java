/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyvalue;

/**
 *
 * @author J2EE-33
 */
public class PassTest {
    public static int changeInt(int value) {
        value = 55;
        return value;
    }
    
    public static void main(String[] args) {
        int value;
        value=11;
        
        System.out.println(changeInt(value));
    }
    
    
}
