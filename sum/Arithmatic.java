/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author J2EE-33
 */
public class Arithmatic {
    private int fnum;
    private int lnum;
    private int result = 0;

    public int add(int a, int b){ 
        int i;
        for (i=a;i<=b;i++){
            result+=i;
        }
        return result;
        
        //return result = a+b;
    }
}
