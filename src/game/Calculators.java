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
    public static double multiplierCalculator(double multiplier){
        multiplier = Math.random();
        double plusOne = Math.random();
        multiplier = Math.floor(multiplier * 100) / 100;
        if (plusOne > 0.5){multiplier = multiplier + 1;}
        else{multiplier = multiplier;}  
        return multiplier;
                }
    
    public Calculators(){
        health = vitality*1.5;
        damage = strength*3.5;
        speed = agility*1.1;   
    }
}
