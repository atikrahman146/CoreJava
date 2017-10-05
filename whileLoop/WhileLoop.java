/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileLoop;

/**
 *
 * @author J2EE-33
 */
public class WhileLoop {
    private int a;
    private int b;
    private int result = 0;
    
    public int whileSum(int a,int b){
        int i = a;
        while(i<=b){
            result += i;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        WhileLoop whileTotal = new WhileLoop();
        System.out.println("While loop Total: " + whileTotal.whileSum(1, 100) );
    }
}
