/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct08_IO;

/**
 *
 * @author J2EE-33
 */
public class TestArgs {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Args[" + i + "] is '" + args[i] + "'");
        }
    }
}
