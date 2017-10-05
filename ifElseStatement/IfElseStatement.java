/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseStatement;

/**
 *
 * @author J2EE-33
 */
public class IfElseStatement {
    public int x;
    public int y; 

    public IfElseStatement() {
    }
    
    public String whoisbig(int x, int y){
        if (x < y){
            return y + " is bigger";
        }else{
            return x + " is bigger";
        }
    }    
    
}
