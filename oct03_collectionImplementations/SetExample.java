/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_collectionImplementations;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("one");
        set.add("second");
        set.add("3rd");
        set.add(new Integer(4));
        set.add(new Float(5.04F));
        set.add("second");
        set.add(new Integer(4));
        System.out.println(set);
                
    }
}
