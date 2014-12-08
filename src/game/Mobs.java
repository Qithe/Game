/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;



/**
 *
 * @author oscarwolter
 */
public class Mobs extends Variabler{
    public static void varulvStats() {
        strength = 4;
        intellegence = 1;
        agility = 3;
        vitality = 2;
        
        double Hp = hpCalculator(vitality);
        double dmg;
    }
    public static void ryskSoldatStats() {
        int ryskSoldatStrength = 3;
        int ryskSoldatIntellegence = 2;
        int ryskSoldatAgility = 2;
        int ryskSoldatVitality = 3;
    }
    public static void spindelStats() {
        int spindelStrength = 1;
        int spindelIntellegence = 2;
        int spindelAgility = 5;
        int spindelVitality = 2;
    }
    public static void trollKarlStats() {
        int trollKarlStrength = 1;
        int trollKarlIntellegence = 6;
        int trollKarlAgility = 1;
        int trollKarlVitality = 2;
    }
    public static void ryskUbåtStatsBoss() {
        int ryskUbåtStrength = 8;
        int ryskUbåtIntellegence = 4;
        int ryskUbåtAgility = 0;
        int ryskUbåtVitality = 30;
    }
    public static void denAlsmäktigeKarlStatsBoss() {
        int denAlsmäktigeKarlStrength = 6;
        int denAlsmäktigeKarlIntellegence = 10;
        int denAlsmäktigeKarlAgility = 1;
        int denAlsmäktigeKarlVitality = 20;
    }
}
