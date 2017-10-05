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
public class Car extends Company{
    Seat Seat;

    public Car(Seat Seat, String BMW, String Tesla, String Ford) {
        super(BMW, Tesla, Ford);
        this.Seat = Seat;
    }

    public Seat getSeat() {
        return Seat;
    }

    @Override
    public String getBMW() {
        return BMW;
    }

    @Override
    public String getTesla() {
        return Tesla;
    }

    @Override
    public String getFord() {
        return Ford;
    }

    public String electrical(String a){
        return a;
    }
    public int maxSpeed(int a){
        return a;
    }
    public String design(String a){
        return a;
    }

    
}
