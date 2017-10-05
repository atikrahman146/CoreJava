/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct04_collection_set;

/**
 *
 * @author J2EE-33
 */
public abstract class Company {
    String BMW;
    String Tesla;
    String Ford;

    public Company(String BMW, String Tesla, String Ford) {
        this.BMW = BMW;
        this.Tesla = Tesla;
        this.Ford = Ford;
    }
    
    public String getBMW() {
        return BMW;
    }

    public String getTesla() {
        return Tesla;
    }

    public String getFord() {
        return Ford;
    }
  
}
