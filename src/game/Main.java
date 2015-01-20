/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author erikkarlsson & Qithe
 */
public class Main {

    static int playerArmorFortyStart = 2, playerArmorStart = 4, PlayerArmorTotal = playerArmorStart + playerArmorFortyStart;
    static int playerArmorFortyCur = 2, playerArmorCur = 4, playerArmorTotalCur = playerArmorFortyCur + playerArmorCur;
    static int playerSpeedStart = 10, mobSpeedStart = 12, mobHpStart = 24,  playerHpStart = 100, playerDmgStart = 3,mobDmgStart = 12;
    static int playerSpeedCur = 10, mobSpeedCur = 12, mobHpCur = 24,  playerHpCur = playerHpStart, playerDmgCur = 3,mobDmgCur = mobDmgStart;
    static int score;
    
    /*
    static int playerLevel=0, bowSkill=0, XBowSkill=0, stoneSkill=0, slingStoneSkill, throwKnifeSkill, throwAxeSkill, throwPotionSkill;
    static int swordSkill, axeSkill, maceSkill;
    static int playerArmorFortyStart = 2, playerArmorStart = 4, PlayerArmorTotal = playerArmorStart + playerArmorFortyStart;
    static int playerArmorFortyCur = 2, playerArmorCur = 4, playerArmorTotalCur = playerArmorFortyCur + playerArmorCur;
    static Scanner scan = new Scanner(System.in);
    static int playerSpeedStart = 10, mobSpeedStart = 12, mobHpStart = 10,  playerHpStart = 20, playerDmgStart = 4,mobDmgStart = 2;
    static int playerSpeedCur = 10, mobSpeedCur = 12, mobHpCur = 10,  playerHpCur = 20, playerDmgCur = 4,mobDmgCur = 2;
    static int score = 10;
    
    static String bowName = "Bow"; static int bowDmg = playerLevel*2 + bowSkill;
    static String XBowName = "Crossbow" ; static int XBowDmg = playerLevel* 3 + XBowSkill;
    static String stoneName = "Stone"; static int stoneDmg = playerLevel* 1 + stoneSkill;
    static String slingStoneName="Sling and Stone"; static int slingStoneDmg = playerLevel * 2 + slingStoneSkill;
    static String throwKnifeName= "Throwing Knife"; static int throwKifeDmg = playerLevel * 2 + throwKnifeSkill;
    static String throwAxeName="Tomahawk"; static int throwingAxeDmg = playerLevel * 2 + throwAxeSkill;
    static String throwPotionName="Throwing Potion Bottle"; static int throwPotionDmg = playerLevel *  + throwPotionSkill;
    
    static String Sword1hName="Sword"; static int Sword1hDmg = playerLevel * + swordSkill;
    static String Axe1hName="War axe"; static int Axe1hDmg = playerLevel * + axeSkill;
    static String Mace1hName="Mace"; static int Mace1hDmg = playerLevel * + maceSkill;
    static String Sword2hName="Great Sword"; static int Sword2hDmg = playerLevel * + swordSkill;
    static String Axe2hName="Dubble Headed Axe"; static int Axe2hDmg = playerLevel * + axeSkill;
    static String Mace2hName="War Hammer"; static int Mace2hDmg = playerLevel * + maceSkill;
    
    
    static String Name=""; static int Dmg = playerLevel * + skill;
    */
    
    static Scanner scanner = new Scanner(System.in);
    
    static int strength, vitality, agility, intellegence;
    
    static int svårighetsgrad, attributPoäng;
    
    static String mob1, mob2, mob3, mob4, mob5, mob6, mob7, mob8, mob9, mob10;
    
    static int mob1Strength, mob2Strength, mob3Strength, mob4Strength, mob5Strength, mob6Strength, mob7Strength, mob8Strength, mob9Strength, mob10Strength;
    
    static String mobType [] = new String[10];
    
    public static void main(String[] args) {
        
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
    
    public static void svårighetsgrad(){
        boolean fortsätt = true;
        
        while(fortsätt){
            System.out.println("Välj svårighetsgrad: ");
            System.out.println("1 : Lätt");
            System.out.println("2 : Medel");
            System.out.println("3 : Svår\n");
        
            System.out.print("Val: ");
            svårighetsgrad = scanner.nextInt();
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
    
    public static void attributer(){
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
                attributPoäng = 60;
                
                
                
                
                
                
                
                
                
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
                attributPoäng = 50;
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
                attributPoäng = 40;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void attackModule_Start(){
        System.out.println("Striden Startar!\nEn vild "+mobType [1]+" står framför dig!\n\n");
        attackModule_Menu_Action();
    }   
    
    public static void attackModule_Stats(){
        System.out.println("\n\n\n ////////|||\\\\\\\\\\\\\\\\");
        System.out.println(" |||STATS:\n\n |||Din hp: "+playerHpCur+"/"+playerHpStart+"\n |||"+mobType [1]+" hp: "+mobHpCur+"/"+mobHpStart);
        System.out.println(" \\\\\\\\\\\\\\\\|||//////// \n\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Menu_Action(){
        System.out.print("Vad är ditt val?\n");
            System.out.println("1.      Attackera\n2.      Försvarställning\n3.      Drycker\n4.      Föremål\n5.      Statestik\n");
            int attackModule_Menu_Action_Choice = scanner.nextInt();
            switch (attackModule_Menu_Action_Choice){
                case 1:attackModule_Attack();
                    break;
                case 2:attackModule_Fortify();
                    break;
                case 3: attackModule_Menu_PotionsMenu();
                    break;
                case 4: attackModule_Menu_ItemsMenu();
                    break;
                case 5: attackModule_Stats();
                    break;
                default: System.out.println("Redo\n\n");
                    attackModule_Menu_Action();
                    break; 
            }
    }
    public static void attackModule_Attack(){
        if(playerSpeedCur > mobSpeedCur){
            attackModule_Attack_PlayerFirst();
        } else if (playerSpeedCur < mobSpeedCur) {
            attackModule_Attack_MobFirst();
        }
    }
    public static void attackModule_Attack_PlayerFirst(){
        mobHpCur = mobHpCur - playerDmgCur;
        System.out.println("Du svingar dit svärd mot "+mobType [1]+" och gör "+playerDmgCur+" Skada\n\n");
            if(mobHpCur <= 0){
                attackModule_Victory();
            } 
            else if (mobHpCur > 0) {
                playerHpCur = playerHpCur - mobDmgCur;
                if(playerHpCur>0){
                    System.out.println(mobType [1]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
                    attackModule_Menu_Action();
                } 
                else if (playerHpCur <= 0){
                    System.out.println(mobType [1]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
                    attackModule_GameOver();
                }
            }
    }
    public static void attackModule_Attack_MobFirst(){
        playerHpCur = playerHpCur - mobDmgCur;
        System.out.println(mobType [1]+" Attakerar dig och gör "+mobDmgCur+" skada på dig\n\n");
        if(playerHpCur<=0){
        attackModule_GameOver();  
        } 
        else if (playerHpCur>0){
            mobHpCur = mobHpCur - playerDmgCur;
            if(mobHpCur <= 0){
                System.out.println("Du svingar dit svärd mot "+mobType [1]+" och gör "+playerDmgCur+" Skada\n\n");
                attackModule_Victory();
            }
            else if(mobHpCur > 0){
                System.out.println("Du svingar dit svärd mot "+mobType [1]+" och gör "+playerDmgCur+" Skada\n\n");
                attackModule_Menu_Action();
            }
        }
    }
    
    public static void attackModule_Fortify(){
        System.out.println("Du reser din sköld som reducerar monstrenas attack och ger dig tid att återhämta dig\n\n");
        playerHpCur += (playerHpStart/10);
        if (playerHpCur >= playerHpStart){
            playerHpCur = playerHpStart;
        }
        System.out.println("Din hälsa ökade med: "+playerHpStart/10+"\n\n");
        
        playerHpCur = playerHpCur - mobDmgCur;
        System.out.println(mobType [1]+"Attakerar dig och gör "+mobDmgCur/2+" skada på dig\n\n");
        
        attackModule_Menu_Action();
        
    }
    public static void attackModule_Menu_PotionsMenu(){
        System.out.println("There is nothing here but us chickens\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Menu_ItemsMenu(){
        System.out.println("There is nothing here but us chickens\n\n");
        attackModule_Menu_Action();
    }
    public static void attackModule_Victory(){
        System.out.println("Grattis, du vann!! Men du vet inte vad som väntar runt krönet\n\n");
        score = score + 10;
    }
    
    public static void attackModule_GameOver(){
        System.out.println("Du ligger på marken, det svartnar för ögonen. Du tänker: 'Jag förlorade?'\nDin poäng var: "+score+"\n\n");
    }
}