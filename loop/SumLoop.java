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
public class SumLoop {
    private int a;
    private int b;
    int result = 0;
    
    public int forSum(int a, int b){
        for(int i = a; i<=b; i++){
            result += i;
        }
        return result;
    }
    
    public int whileSum(int a,int b){
        int i = a;
        while(i<=b){
            result += i;
            i++;
        }
        return result;
    }
    
    public int doSum(int a,int b){
        int i = a;
        do{
            result += i;
            i++;
        }while(i<=b);
        
        return result;
    }
}
