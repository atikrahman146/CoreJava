/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct05_generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author J2EE-33
 */
public class TestGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Jai");
        //list.add(32);
        
        String s = list.get(1); // Type casting is not required
        
        System.out.println("Element is: " + s);
        

        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        
        //for(String ss:list){
            //System.out.println(ss);
        //}
        
        //Iterator<String> itr = list.iterator();
        //while(itr.hasNext()){
            //.out.println(itr.next());
        //}
    }
}
