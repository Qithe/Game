/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author oscarwolter
 */
public class Modules {
    public static void spelet(){
        System.out.println("yoooooooooooooooooooooooooooo");
    }
    public static void encounter() {
       
    }
    public static void mobSlumpning() {
        
    }
    public static void player() {
       playerDmg = playerStrength * 2;
       playerHp = playerVitality * 3;
       
       
    }
    
    public static void attackModul() {

            if(playerSpeed > mobSpeed){
                mobHp = mobHp - playerDmg;
                if(mobHp>0){
                    playerHp = playerHp - mobDmg;
                 } 
                else {
                    break;
              }
              
            } else {
                playerHp = playerHp - mobDmg;
                if(playerHp>0){
                    mobHp = mobHp - playerDmg;
                } else {
                    break;
                }
            }

    }
    
    
    
    
}
