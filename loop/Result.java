/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author J2EE-33
 */
public class Result {
    public static void main(String[] args) {
        SumLoop forTotal = new SumLoop();
        SumLoop whileTotal = new SumLoop();
        SumLoop doTotal = new SumLoop();
        System.out.println("For loop Total: " + forTotal.forSum(1, 100) );
        System.out.println("While loop Total: " + whileTotal.whileSum(1, 100) );
        System.out.println("Do loop Total: " + doTotal.doSum(1, 100) );
    }
}
