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
public class AddException {

    public static void main(String[] args) {
        try {
            try {
                args = new String[1];
                args[0] = "1";

                System.out.println("Index = " + args[1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sep27_addition.ArrayIndexOutOfBoundsException.main()");
            }

            System.out.println(10 / 0);

        } catch (ArithmeticException e) {
            System.out.println("sep27_addition.AddException.main()");
        }finally{
            System.out.println("Final ");
        }
    }
}
