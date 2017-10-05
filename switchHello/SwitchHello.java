/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchHello;

/**
 *
 * @author J2EE-33
 */
public class SwitchHello {
    
    private static int x = 10;
    
    public static int add(int value){
         x += value;
         return x;
    } 
    
    public static int substract(int value){
         x -= value;
         return x;
    }
    
    public static void main(String[] args) {
        switch (x) {
            case 10:
                System.out.println("X: " + x);
                System.out.println("Add 4 with x: " + add(4));
                System.out.println("Substract 6 from x: " + substract(6));
                break;
            case 20:
                System.out.println("Hello BD");
                break;
            case 30:
                System.out.println("Hello DK");
                break;
            default:
                System.out.println("Not in World, BD or DK");
        }
    }
}
