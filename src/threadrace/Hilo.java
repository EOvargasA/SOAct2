/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadrace;
import java.util.Random;

/**
 *
 * @author osiri
 */
public class Hilo extends Thread {
    String name;
    double speed;
    
    public Hilo(String n){
        name = n;
        speed= 12 + Math.floor((Math.random())*10);
    }

    
    public double race(){
        return speed; 
   }
}
