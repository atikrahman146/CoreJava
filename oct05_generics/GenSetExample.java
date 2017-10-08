/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct05_generics;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author J2EE-33
 */
public class GenSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("second");
        set.add("three");
        
        System.out.println(set);
        
    }
}
