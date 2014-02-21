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
class HelpMenuView  {
        
    private final static String[][] menuItems = {
        {"1", "The board"}, 
        {"2", "The connect4 game"},
        {"3", "A location"},
        {"4", "A marker"},
        {"5", "A regular player"},        
        {"6", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "2":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "3":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "4":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                 case "5":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break; 
                case "6": 
                    break;
                default: 
                    new Connect5().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("8"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
