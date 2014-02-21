/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//testing
package connect5;

import java.awt.Point;
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

    void displayError(String invalid_command_Please_enter_a_valid_comm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

// class HelpMenuControl  {
//    
//    public HelpMenuControl() {
//        
//    } 
//
//    public void displayBoardHelp() {
//        System.out.println();
//        this.displayHelpBorder();             
//        System.out.println( 
//                "\tThe game board for connect4. It consist of a grid of "
//                + "\n\tlocations. Players place their marker on the different locations "
//                + "\n\ton the board in an effort to win the game. The default board is "
//                + "\n\t6 rows by 7 columns.");
//        displayHelpBorder();
//    }
//    
//    
//        
//    public void displayGameHelp() {
//        System.out.println();
//        displayHelpBorder();     
//        System.out.println( 
//                 "\tThe objective of the game is to be the first player to mark four "
//                + "\n\tsquares vertically, horizontally or diagonally. Each player takes "
//                + "\n\tturns placing their marker in one of the locations on the "
//                + "\n\tboard. The first player to get \"four-in-a-row\" is the winner."
//                ); 
//        displayHelpBorder();
//    }
//            
//    public void displayRealPlayerHelp() {
//        System.out.println();
//        displayHelpBorder();     
//        System.out.println( 
//                "\tA real player manually takes their turn by placing their mark "
//                + "\n\tin an unused location on the board."
//                ); 
//        displayHelpBorder();
//    }
//    
//                   
//    public void displayLocationHelp() {
//        System.out.println();
//        displayHelpBorder();     
//        System.out.println( 
//               "\tA location on the board where a player can place their marker"
//                ); 
//        displayHelpBorder();
//    }
//                 
//    public void displayMarkerHelp() {
//        System.out.println();
//        displayHelpBorder();     
//        System.out.println( 
//               "\tA symbol that \"marks\" the locations in the board that are occupied "
//                + "by the player. "
//                + "\n\tThe default markers are \"r\" and \"b\"."
//                ); 
//        displayHelpBorder();
//    }
//    
//    
//    public void displayHelpBorder() {       
//        System.out.println(
//        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//    }
//
//    private static class Game {
//
//        public Game() {
//        }
//    }
    
  