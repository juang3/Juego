/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Administrador
 */
public class Prize {
    private int treasures;
    private int levels;
    
    public Prize(int tesoros, int niveles ){
        treasures   = tesoros;
        levels      = niveles;
    }
    public int getTreasures(){
        return treasures;
    }
    public int getLevels(){
        return levels;
    }
    
}
