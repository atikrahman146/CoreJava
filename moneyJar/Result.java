/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyJar;

/**
 *
 * @author J2EE-33
 */
public class Result {
    public static void main(String[] args) {
        MoneyJar money = new MoneyJar();
        int moneySHow = money.getIntValue("25");
        System.out.println("money: " + moneySHow);
    }
}
