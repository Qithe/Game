/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;



/**
 *
 * @author oscarwolter
 */
public abstract class Variabler {
    public int mob1, mob2, mob3, mob4, mob5, mob6, mob7, mob8, mob9, mob10;
    public double vitality, strength, agility, intellegence;
    public double damage, health, speed, swiftnes = 0/*20%chans till dodge*/, criticalHit = 0/*10% chans till Critical hit*/;
    public int playerStrength, playerVitality;
    public int svårighetsgrad, attributPoäng;
}
