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
public class Concat {
    public String getConcatResult(String title, String firstpart, String secondpart){
        String fullname = title + " " + firstpart + " " + secondpart;
        return fullname;
    }
}

