

/*
Program Name: HighLowGame
Name: Jeremy Richard-Ikediashi & Kamsiyochukwu Uwah
Date:1\31\2022
 */
import java.util.*;
public class HighLowGame {
     public static void main(String[] args) {
        String h = "H";
        String l= "L";
        Scanner keyboard= new Scanner(System.in);
        Random randGen = new Random();
        
        System.out.println("This is a program to simulate dice throws"
                + " of both the user and the computer and check if the "
                + " user gets higher or lower\n");
        System.out.println("The user is to roll the dice 5 times and guess "
                + "whether their dice roll would be higher or lower than the "
                + "computer by typing H or L\n");
        System.out.println("Once the user has rolled the dice, the scores"
                + " on the dice would be added up. The computer's"
                + "dice roll would also be simulated and added together."
                + " If the user guessed right, one point would be added to their"
                + " score.\n");
        
        int val1=(randGen.nextInt(6)+1);
        int val2=(randGen.nextInt(6)+1);
        int val3=(randGen.nextInt(6)+1);
        int val4=(randGen.nextInt(6)+1);
        int val5=(randGen.nextInt(6)+1);
        System.out.println("You rolled the following values:");
        System.out.println("die 1 --> "+val1);
        if (val1==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val1==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val1==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val1==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val1==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val1==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 2 --> "+val2);
        if (val2==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val2==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val3==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val2==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val2==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val2==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 3 --> "+val3);
        if (val3==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val3==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val3==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val3==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val3==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val3==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 4 --> "+val4);
        if (val1==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val2==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val3==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val4==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val4==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val4==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 5 --> "+val5);
        if (val5==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val5==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val5==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val5==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val5==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val5==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        int sum_of_values=val1+val2+val3+val4+val5;
        System.out.println("This totals to "+sum_of_values);
        
        System.out.print("Please enter H if you think your roll is going to be"
                + "higher or L if you think it is going to be lower:\n"
                + "--> ");
        String input=keyboard.next();
        System.out.println(input);
        
        int val6=(randGen.nextInt(6)+1);
        int val7=(randGen.nextInt(6)+1);
        int val8=(randGen.nextInt(6)+1);
        int val9=(randGen.nextInt(6)+1);
        int val_10=(randGen.nextInt(6)+1);
        
        System.out.println("The computer rolled the following values:");
        System.out.println("die 1 --> "+val6);
        if (val6==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val6==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val6==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val6==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val6==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val6==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 2 --> "+val7);
        if (val7==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val7==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val7==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val7==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val7==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val7==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 3 --> "+val8);
        if (val8==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val8==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val8==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val8==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val8==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val8==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 4 --> "+val9);
        if (val9==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val9==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val9==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val9==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val9==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val9==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        
        System.out.println("die 5 --> "+val_10);
        if (val_10==1){
            System.out.println("-----\n" +
                                    "|   |\n" +
                                    "| o |\n" +
                                    "|   |\n" +
                                    "-----");
        }
        else if(val_10==2){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "|   |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val_10==3){
            System.out.println("-----\n" +
                                    "|o  |\n" +
                                    "| o |\n" +
                                    "|  o|\n" +
                                    "-----");
        }
        else if(val_10==4){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|   |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val_10==5){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "| o |\n" +
                                    "|o o|\n" +
                                    "-----");
        }
        else if(val_10==6){
            System.out.println("-----\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "|o o|\n" +
                                    "-----");
            
        }
        int sum_of_values2=val6+val7+val8+val9+val_10;
        System.out.println("This totals to "+sum_of_values2);
        
        if (sum_of_values>sum_of_values2){
            if (input.equals(h)){
                System.out.println("You called higher therefore your guess was"
                        + " wrong");
                        
                        }
            else{
                System.out.println("You called lower and scored one plus point");
            }
        }
        else{
            if (input.equals(h)){
                System.out.println("You called higher and scored one plus point");
            }
            else{
                System.out.println("You called lower and your guess was wrong");
            }
        }
        System.out.println("\nThis program is now ending!");
       
     }
}
