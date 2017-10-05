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
public class AddSubs {
    private static String x = "10";
    private static int y= 5;
    private int result = 0;

    public AddSubs() {
    }
    
    public int doAdd(String a,int b){
        result = Integer.parseInt(a)+b;
        return result;
    }
    public int doSubs(String a,int b){
        result = Integer.parseInt(a)-b;
        return result;
    }
    public int doDiv(String a,int b){
        result = Integer.parseInt(a)/b;
        return result;
    }
    
    public static void main(String[] args) {
        AddSubs result = new AddSubs();
        
        System.out.println("Add: " + result.doAdd(x, y));
        System.out.println("Substriction: " + result.doSubs(x, y));
        System.out.println("Division: " + result.doDiv(x, y));
        
        
         System.out.println("Y as String: " + Integer.toString(y));
    }
    
}
