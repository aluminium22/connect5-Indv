/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//testing
package connect5;

import java.util.Scanner;

/**
 *
 * @author Lorinlochridge
 */
public class Connect5 {
    String description = " Great, let's get on with the game ";
    String tooyoung = "Maybe you should go find another game... ";
    String age;
    String name;
    String instructions = "  The first player to achieve this goal wins."
            + "This is connect four. The object of the game is to get four in a row. \n " + "You can make your connections of 4 any direction, including vertical, horizontal, and angled.";
    //board body:
    String toprow = " _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|";
    //board vars
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect5 myGame = new Connect5();
    myGame.getName();
    myGame.getAge();
    myGame.ageAllow();
    myGame.displayHelp();
    myGame.displayBoard();
            }
    
    public void getName() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    this.name = input.next();
    }
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    public void getAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\r" + this.name + " are you younger than 4 years old?: ");
        this.age = input.next();
    }
    public void ageAllow() {
        if ("yes".equals(age)) {
        System.out.println(this.tooyoung);
        } else {
        System.out.println(this.description);
        }
    }
    public void displayBoard() {
        System.out.println(this.toprow);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
    }
    }