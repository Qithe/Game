/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;



/**
 *
 * @author oscarwolter
 */
public class characterCreation extends Variabler {
    public svårighetsgrad(){
        boolean fortsätt = true;
        
        while(fortsätt){
            System.out.println("Välj svårighetsgrad: ");
            System.out.println("1 : Lätt");
            System.out.println("2 : Medel");
            System.out.println("3 : Svår\n");
        
            System.out.print("Val: ");
            svårighetsgrad = Scanner.nextInt();
            System.out.println("");
            if(svårighetsgrad != 1 && svårighetsgrad != 2 && svårighetsgrad != 3){
                System.out.println("Det är inget alternativ\n\nVälj igen:\n");
            }
            else{
                fortsätt = false;
            }
        }
        
        attributer();
    }
    public attributer(){
        boolean fortsätt = true;
        boolean alltUtdelat = false;
        
        while(!alltUtdelat){
            
            intellegence = 0;
            strength = 0;
            agility = 0;
            vitality = 0;
            
            
            if(svårighetsgrad == 1){
                attributPoäng = 40;
                
                System.out.println("Du har valt svårighetsgraden: Lätt\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    Variabler.intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(Variabler.intellegence > Variabler.attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                attributPoäng = 40;
            }
            else if(svårighetsgrad == 2){
                attributPoäng = 30;
                
                System.out.println("Du har valt svårighetsgraden: Medel\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(intellegence > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                attributPoäng = 30;
            }
            else{
                attributPoäng = 20;
                
                System.out.println("Du har valt svårighetsgraden: Svår\n\nSå du har " + attributPoäng 
                        + " poäng som du får sätta ut på antingen: intellegence, \nstrength, agility eller"
                        + " vitality utöver dina 5 basic points.\n");
                
                while(fortsätt){
                    System.out.print("Intellegence: +");
                    intellegence = scanner.nextInt();
                    System.out.println("");
                    
                    if(intellegence > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på intellegence\n");
                    }
                    else if(intellegence < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= intellegence;
                        intellegence += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Strength: +");
                    strength = scanner.nextInt();
                    System.out.println("");
                    
                    if(strength > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på strength\n");
                    }
                    else if(strength < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= strength;
                        strength += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Agility: +");
                    agility = scanner.nextInt();
                    System.out.println("");
                    
                    if(agility > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på agility\n");
                    }
                    else if(agility < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= agility;
                        agility += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                
                while(fortsätt){
                    System.out.print("Vitality: +");
                    vitality = scanner.nextInt();
                    System.out.println("");
                    
                    if(vitality > attributPoäng){
                        System.out.println("Du har inte så många poäng att spendera på vitality\n");
                    }
                    else if(vitality < 0){
                        System.out.println("Du kan inte ta bort poäng\n");
                    }
                    else{
                        attributPoäng -= vitality;
                        vitality += 5;
                        fortsätt = false;
                    }
                }
                fortsätt = true;
                attributPoäng = 20;
            }
            if((intellegence + strength + agility + vitality) != attributPoäng){
                    System.out.println("Du spenderade inte alla dina poäng. Så du får välja om igen\n");
            }
            else{
                System.out.println("Så, nu har du:\nIntellegence = " + intellegence + "\nStrength = " + 
                        strength + "\nAgility = " + agility + "\nVitality = " + vitality + "\n");
                
                System.out.print("Är du nöjd med det?\n1 : Ja\n2 : Nej\nSvar: ");
                int svar = scanner.nextInt();
                System.out.println("");
                
                if(svar == 1){
                    System.out.println("Va bra. Då fortsätter vi\n");
                    alltUtdelat = true;
                }
                else{
                    System.out.println("Då väljer vi om igen\n");
                }
            }
        }
    }
    public static void mobVal(){
        System.out.println("Välj vilka monster du vill möta i grottan. \n\nOch kom ihåg att du kan lägga in ett"
                + " monster mer än 1 gång och då ökar du chansen att möta den.\n\nMobtyperna är: varulv,"
                + " ryskSoldat, spindel, trollKarl.\n\nSkriv in EXAKT som deras namn står åvan, annars så"
                + " registreras det inte");
        
        scanner.nextLine();
        System.out.println("Val:");
        for(int i = 0; i < 10; i++){
            System.out.print("\nMob " + (i + 1) + ": ");
            mobType [i] = scanner.nextLine();
        }
        scanner.nextLine();
        System.out.println("");
    }
    
    public static void mob1(){
        mob1 = mobType [0];
        mob1Strength = 3;
    }
    
    public static void mob2(){
        mob2 = mobType [1];
        mob2Strength = 3;
    }
    
    public static void mob3(){
        mob3 = mobType [2];
        mob3Strength = 3;
    }
    
    public static void mob4(){
        mob4 = mobType [3];
        mob4Strength = 3;
    }
    
    public static void mob5(){
        mob5 = mobType [4];
        mob5Strength = 3;
    }
    
    public static void mob6(){
        mob6 = mobType [5];
        mob6Strength = 3;
    }
    
    public static void mob7(){
        mob7 = mobType [6];
        mob7Strength = 3;
    }
    
    public static void mob8(){
        mob8 = mobType [7];
        mob8Strength = 3;
    }
    
    public static void mob9(){
        mob9 = mobType [8];
        mob9Strength = 3;
    }
    
    public static void mob10(){
        mob10 = mobType [9];
        mob10Strength = 3;
    }
    
    public static void spelet(){
        System.out.println("Nu ska du gå in i grottan.\n");
        mobVal();
    }
}
