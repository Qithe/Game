/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscarwolter
 */
public class Game {static boolean endOfBattle;
    
    
    public static double hpUträknare(int Hp){
        int hp = vitalityHp * 10;
        return hp;
    }
    
    
    
    
    public static void main(String[] args) {
        

        Player slayer = new Player();
        slayer.printHealth();
        Varulv ulf = new Varulv();
        ulf.printstrength();
        
        
        
        
        
        
        System.out.println("Knugen av Grottan\n");
        
        System.out.print("1: Starta eller 2: info?\n\nVal: ");
        int val = scanner.nextInt();
        
        if(val == 2){
            System.out.println("");
            info();
        }
        else{
            System.out.println("");
            svårighetsgrad();
        }
        spelet();
        
    }
    public static void info(){
        
    }
    
        }
    }
    
    
}

   
