/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author oscarwolter
 */
public class Player extends Variabler{
    
    
    public Player()
    {
        health = 20;
        
    }
    
    
    public void printHealth()
    {
        System.out.println("This player has "+health + " hp");
    }
    
    
}
