/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep26_dog;

/**
 *
 * @author J2EE-33
 */
public class Tommy extends Dog{
    private String friend;

    public Tommy(String friend, String faithful, String bark, String run) {
        super(faithful, bark, run);
        this.friend = friend;
    }

    public String getFriend() {
        return friend;
    }

    @Override
    public String getDetails() {
        return bark + ", he " + run  + ", he is " + faithful + " and he "+ friend + '}';
    }
    
}
