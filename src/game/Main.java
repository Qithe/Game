package game;

import java.util.Scanner;
import java.util.Random;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    static boolean tomtRum;
    
    static int strength, vitality, agility, intellegence;
    
    static int svårighetsgrad, attributPoäng, rumNr;
    
    static String mob1, mob2, mob3, mob4, mob5, mob6, mob7, mob8, mob9, mob10;
    
    static int mobEncStrength [] = new int[3], mobEncVitality [] = new int[3], mobEncAgility [] = new int[3], 
            mobEncIntellegence [] = new int[3], rum [] = new int[1000];
    
    static String mobType [] = new String[10];
    
    static int varulvStrength, varulvVitality, varulvAgility, varulvIntellegence, spindelStrength, 
            spindelVitality, spindelAgility, spindelIntellegence, ryskSoldatStrength, ryskSoldatVitality, 
            ryskSoldatAgility, ryskSoldatIntellegence, trollKarlStrength, trollKarlVitality, trollKarlAgility, 
            trollKarlIntellegence;
    
    static Random random = new Random();
    
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
    
    /*public static void mob1(){
        mob1 = mobType [0];
        mob1Strength = 6;
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
    }*/
    
    public static void varulv(){
        
        varulvStrength = 4 * svårighetsgrad;
        varulvVitality = 2 * svårighetsgrad;
        varulvAgility = 3 * svårighetsgrad;
        varulvIntellegence = 1 * svårighetsgrad;
        
        
    }
    
    public static void trollKarl(){
        
        trollKarlStrength = 1 * svårighetsgrad;
        trollKarlVitality = 3 * svårighetsgrad;
        trollKarlAgility = 2 * svårighetsgrad;
        trollKarlIntellegence = 4 * svårighetsgrad;
        
        
    }
    
    public static void spelet(){
        System.out.println("Nu ska du gå in i grottan.\n");
        //mobVal(); ska in senare
        mobSlumpning();
    }
    
    public static void mobSlumpning(){
        
        int monsterNummer = random.nextInt(8);
        
        for(int i = 0 ; i < 10 ; i++){
            if(monsterNummer == 0 || monsterNummer == 1 || monsterNummer == 2 || monsterNummer == 3){
                mobType [i] = "varulv";
            }
            else{
                mobType [i] = "trollKarl";
            }
        }
    }
    
    public static boolean mobEncounter(int mob){
        boolean klar = false;
        
        int i = random.nextInt();
        
        if(mobType [i] == "varulv"){
            mobEncStrength [mob] = varulvStrength;
            mobEncVitality [mob] = varulvVitality;
            mobEncAgility [mob] = varulvAgility;
            mobEncIntellegence [mob] = varulvIntellegence;
            klar = true;
        }
        else if(mobType [i] == "trollKarl"){
            mobEncStrength [mob] = trollKarlStrength;
            mobEncVitality [mob] = trollKarlVitality;
            mobEncAgility [mob] = trollKarlAgility;
            mobEncIntellegence [mob] = trollKarlIntellegence;
            klar = true;
        }
        else{
            System.out.println("Det blev problem här du =(\n");
        }
        
        return klar;
        
        //att sätta in för att kalla på mobval
        /*boolean klar = false;
        
        while(klar){
            klar = mobEncounter(1);
        }*/
    }
    
    public static void grottIngång(){
        boolean encounter = false;
        
        int tal = random.nextInt(4);
        
        if(tal == 0 || tal == 1 || tal == 2){
            System.out.println("Det står ett monster i grottkammaren. Han hör dig gå in och vänder sig hastigt mot dig");
            encounter = true;
        }
        else if(tal == 3){
            System.out.println("Rummet är tomt och du kan vila ut för stunden. Du regenererar " + playerHpStart/10 
                    + " och du har lite extra tid att leta runt efter föremål");
            tomtRum = true;
            encounter = false;
        }
        else{
            
        }
        
        if(encounter){
            attackModule_Start();
        }
        else{
            kammarVal();
        }
    }
    
    public static void kammarVal(){
        boolean fortsätt = false;
        
        System.out.print("Du står nu ensam i kammaren och du funderar över om du ska\n\n1 : Gå direkt till"
                + " nästa rum eller om du ska\n\n2 : Gå och leta runt lite efter föremål\n\nVal: ");
        int val = scanner.nextInt();
        
        while(!fortsätt){
            if(val == 1){
                fortsätt = true;
                movement();
            }
            else if(val == 2){
                fortsätt = true;
                leta();
            }
            else{
                System.out.println("Det där var inget val du =). Välj igen");
            }
        }
    }
    
    public static void movement(){
        
        System.out.println("Du går in i nästa rum");
        rumNr ++;
        
        grottIngång();
    }
    
    public static void leta(){
        String föremål;
        int hittaFöremål;
        
        if(tomtRum){
            hittaFöremål = random.nextInt(3);
        }
        else{
            hittaFöremål = random.nextInt(2);
        }
        
        if(hittaFöremål == 1 || hittaFöremål == 2){
            föremål = "en yxa (som inte gör något ännu tyvärr)";
        }
        else{
            föremål = "ingenting";
        }
        
        System.out.println("Du letar runt lite efter föremål och hittar " + föremål);
    }
}