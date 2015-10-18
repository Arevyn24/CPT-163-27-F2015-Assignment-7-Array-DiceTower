package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
    
    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
    }

    public int getValue() {
        return value;
    }
    
    //add one to offset the starting point at zero
    public void roll() {
        this.value = (new Random()).nextInt(this.sides) + 1; 
    }
    
}
