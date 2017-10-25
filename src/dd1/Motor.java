/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dd1;

public class Motor {
    public int speed; 
    public int speedIndicator;
    
    public Motor(int speed) {
        this.speed = speed;
        speedIndicator = speed;
    }
    
    public void setSpeed(int newSpeed) {
        if (newSpeed > speed){
            System.out.println("accelerating to " + newSpeed);
        }
        else {
            System.out.println("decelerating to " + newSpeed);

        }
        speed = newSpeed;
        speedIndicator = speed;
    }
    
    
}
