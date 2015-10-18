package dnddiceroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dice Tower.
 * A Dice Tower is a tool used by serious gamers use to roll many dice at once.
 * It looks like this https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg
 * An instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel to
 * panel until they exit the dice tower at the bottom tray.
 * A dice tower will accept a collection of dice and reports their results when
 * they reach the tray at the bottom
 * @author Paul Scarrone
 */
public class DiceTower {
    final int PANEL_COUNT = 3;
    List<Die> diceList;
    int trayValue;

    public DiceTower() {
        this.diceList = new ArrayList();
        trayValue = 0;
    }
  
    public DiceTower(List diceList) {
	this.diceList = diceList;
        trayValue = 0;
    }
    
    public int getTrayValue() {
        return trayValue;
    }
  
    public void dropDice() {
        int i = 0;
        for (Die die : diceList){
            
            for(int n = 0; n < PANEL_COUNT; n++) {
                diceList.get(i).roll();
                
            }
            trayValue += diceList.get(i).getValue();
            i++;
        }   
    } 
}
