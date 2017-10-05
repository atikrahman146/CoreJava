/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author J2EE-33
 */
public class TestExpression {

    public static void main(String[] args) {
        String salutation = "Dr.";
        String name = "Pete" + " " + "Seymore";
        String title = salutation + " " + name;

        if("Dr.".equals(salutation)){
            //System.out.println("Name: " + title);
        }
        
        int x = 8;
        boolean result = x<5;
        boolean result2 = x>5;
        
        //System.out.println(result + " " + result2);
        
        Concat firstresult = new Concat();
        System.out.println(firstresult.getConcatResult("Mr.", "Atik", "Rahaman"));
        
        Concat2 secondresult = new Concat2();
        secondresult.getConcatResult("Mr.", "Atiqur", "Rahaman");
    }
}
