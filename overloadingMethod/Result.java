/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingMethod;

/**
 *
 * @author J2EE-33
 */
public class Result {
    public static void main(String[] args) {
        Statistics test = new Statistics();
        float avg1 = test.average( 1,2);
        float avg2 = test.average( 1,2,3);
        float avg3 = test.average( 1,2,3,4,5);
        
        System.out.println(avg1);
        System.out.println(avg2);
        System.out.println(avg3);
    }
}
