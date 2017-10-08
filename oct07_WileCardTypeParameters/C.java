/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct07_WileCardTypeParameters;

/**
 *
 * @author J2EE-33
 */
public class C extends A{
    String address;

    public C() {
    }

    public C(String name) {
        super(name);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getName() {
        return name;
    }
    
    
}
