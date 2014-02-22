/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect5;

import java.util.Scanner;

/**
 *
 * @author Aluminium
 */
public class MinmMaxView {
    private MinMax minMax;
    String g1,g2,g3,g4,g5;
    private final static String [][] items = {
        {"Enter wins based on last 5 games to get average"},
        {"1","one win"},
        {"0","one loss"},
        {"game 1,2,3,4,5"},
    };
    public MinmMaxView(){
        this.minMax = new MinMax();
    }

public void getGameOne() {
Scanner input =new Scanner(System.in);
System.out.println("enter game 1 win or loss");
this.g1=input.next();
}
public void getGameTwo() {
Scanner input =new Scanner(System.in);
System.out.println("enter game 2 win or loss");
this.g2=input.next();
}
public void getGameThree() {
Scanner input =new Scanner(System.in);
System.out.println("enter game 3 win or loss");
this.g3=input.next();
}
public void getGameFour() {
Scanner input =new Scanner(System.in);
System.out.println("enter game 4 win or loss");
this.g4=input.next();
}
public void getGameFive() {
Scanner input =new Scanner(System.in);
System.out.println("enter game 5 win or loss");
this.g5=input.next();
}
public void displayGamesWinLose(){
        System.out.println("\n"+"Games1 through 5"+ ","+this.g1+","+ this.g2+"," +this.g3+"," + this.g4+"," + this.g5);
}
//does math for entries 
public void getEntryAv(){
   //i would like to send the given strings to MinMax.java for conversion to int and then proceed with needed math for averaging numbers
                    
}
}