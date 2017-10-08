/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct05_generics;

import java.util.ArrayList;

/**
 *
 * @author J2EE-33
 */
public class GenericsAutoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(0, 42);
        list.add(0, 44);
        list.add(0, 41);
        
        int total = list.get(0);
        System.out.println(total);
        
        for(int a : list){
            System.out.println(a);
        }
    }
}
