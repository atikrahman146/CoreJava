/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingMethod;

/**
 *
 * @author J2EE-33
 */
public class Statistics {
    public float average(int x1){
        return x1;
    }
    
    public float average(int x1,int x2){
        int sum = x1 + x2;
        return (float)sum/2;
    }
    
    public float average(int x1,int x2,int x3){
        float sum = x1 + x2 + x3;
        return sum/3;
    }
    
    public float average(float...nums){
        float sum = 0;
        for (float x : nums){
            sum += x;
        }
        return ((float)sum)/nums.length;
    }
}
