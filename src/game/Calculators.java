/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author oscarwolter
 */
public abstract class  Calculators extends Variabler {
    
    public Calculators(){
        health = vitality*1.5;
        damage = strength*3.5;
        speed = agility*1.1;  
    }
}
