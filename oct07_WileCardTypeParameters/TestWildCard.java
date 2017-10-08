/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct07_WileCardTypeParameters;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class TestWildCard {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        
        listA.add(new A("Atik"));
        ProcessElements(listA);
        
        
        List<B> listB = new ArrayList<B>();
        listB.add(new B(25.00));
        listB.add(new B(55.00));
        ProcessElements(listB);
        
        List<A> listAc = new ArrayList<A>();
        listAc.add(new A("Arif"));
        ProcessElementsBitDifferent(listAc);
    }
        
    public static void ProcessElements(List<?> elements){
        for(Object o : elements){
            System.out.println(o);
        }
    }      
    public static void ProcessElementsBitDifferent(List<? extends A> elements){
        for(A a : elements){
            System.out.println(a.getName());
        }
    }
}