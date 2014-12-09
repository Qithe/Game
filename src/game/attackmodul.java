/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author oscarwolter
 */
public abstract class attackmodul extends Variabler{
    public attackmodul() {
            
        double playerSpeed = 0, mobSpeed = 0, mobHp = 0, playerDmg = 0, playerHp = 0, mobDmg = 0;
        
        if(playerSpeed > mobSpeed){
            mobHp = mobHp - playerDmg;
            if(mobHp>0){
                playerHp = playerHp - mobDmg;
             } 
            else {
          }

        } else {
            playerHp = playerHp - mobDmg;
            if(playerHp>0){
                mobHp = mobHp - playerDmg;
            } else {
            }
        }
    }
}
