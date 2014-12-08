/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author oscarwolter
 */
public abstract class Varulv extends Variabler{
    
    public Varulv(){
        strength = 4;
        intellegence = 1;
        agility = 3;
        vitality = 2;
    }
    
    public void printstrength(){
        System.out.println(strength);
    }
}
