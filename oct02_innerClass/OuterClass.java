/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct02_innerClass;

/**
 *
 * @author J2EE-33
 */
public class OuterClass {
    
    public int i = 0;
    
    class InnerClass {
        
        public int i = 1;
        
        void methodInInnerClass(int i) {
            System.out.println("x =" + i);
            System.out.println("this x =" + this.i);
            System.out.println("Outer class this.x =" + OuterClass.this.i);
        }
    }
    
    public static void main(String[] args) {
        OuterClass test = new OuterClass();
        OuterClass.InnerClass InnserTest = test.new InnerClass();
        
        InnserTest.methodInInnerClass(23);
    }
}
