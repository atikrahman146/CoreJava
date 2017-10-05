/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct03_collectionImplementations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add(new Integer(4));
        list.add(new Float(4.0F));
        list.add("Two");
        list.add(new Integer(4));
        list.add(new Float(4.0F));
        
        System.err.println(list);
    }
}
