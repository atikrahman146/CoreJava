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
public class ForIn {
    private static final int nums[] = {4,6,8,2};
    private static int bignum = 0;
    
    public static void main(String[] args) {
        for (int x : nums){
             System.out.println("Number list: " + x);
        }
        
        
        for (int x : nums){
            if(x>bignum){
                bignum = x;
            }
        }
        System.out.println("Larger number: " + bignum);
    }
}