/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warningsystem;

import java.util.Observable;

/**
 *
 * @author Osas
 */
public class WarningData extends Observable{

    /**
     * @return the warningLevel
     */
    public int getWarningLevel() {
        return warningLevel;
    }

    /**
     * @param warningLevel the warningLevel to set
     */
    public void setWarningLevel(int warningLevel) {
        if (warningLevel > 3 || warningLevel < 0 ) return;
//        if (warningLevel < 0) return;
//        if (warningLevel > 3) return;

//          warningLevel is the variable that changes
        this.warningLevel = warningLevel;
//        tells the GUI class(oberver Class) that the warningLevel has changed
        setChanged();
//        this is  what is sent to the GUI update (arg) function 
        notifyObservers(this.warningLevel);
    }
    
//    set a 'level' variable
    private int warningLevel = 0;
}
