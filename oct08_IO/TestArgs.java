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
        args = new String[3];
        args[0] = "1";
        args[1] = "2";
        args[2] = "3";
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args[" + i + "] is '" + args[i] + "'");
        }
    }
}
