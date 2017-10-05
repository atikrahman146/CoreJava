/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_exam.innerClass;

/**
 *
 * @author J2EE-33
 */
public class OutrtClass {
    int i = 0;
    class InnerClass{
        int i = 5;
        
        public void methodtoShow(int i){
            System.out.println("I = " + i);
            System.out.println("this I = " + this.i);
            System.out.println("outer I = " + OutrtClass.this.i);
        }
    }
    
    public static void main(String[] args) {
        OutrtClass test = new OutrtClass();
        OutrtClass.InnerClass a = test.new InnerClass();
        
        a.methodtoShow(6);
    }
}
