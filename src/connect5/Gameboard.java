/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect5;

/**
 *
 * @author Aluminium
 */
public class Gameboard {
    
    Board board;
    
    public void displayBoard(Board board) {
        this.board = board;
        
        this.printHeadRow(); 
        this.printDividerRow(); 
        
        
        for (int i = 0; i < this.board.rowCount; i++) {
            
            Location[] rowOfLocations = this.board.boardLocations[i];
            this.printRow(i+1, rowOfLocations); 
            this.printDividerRow();
        }
        
        System.out.println(); 
         
        return;
    }

    private void printHeadRow() {

        // print the first column in the header row
        System.out.print("\n\t      1   ");
        
        // print remaining header cells in row between the first and last column
        int columnsInRow = this.board.columnCount;
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print("  " + col + "   ");
        }
        // print the header for the last column in the header
        System.out.print(" " + columnsInRow + "   ");
    }

    private void printDividerRow() {

        // print the divider for the first column in the row
        System.out.print("\n\t  |------");
        
        int columnsInRow = this.board.columnCount;
        // print remaining divider for each column between the first and last
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }
        // print the row divider for the last column in the row
        System.out.print("-----|");
    }

    private void printRow(int rowNumber, Location[] rowLocations) {
        
        // print contents of first column in the row
        String letter = " ";
        if (rowLocations[0].player != null) {
            letter = rowLocations[0].player.marker;
        }
        System.out.print("\n\t" + rowNumber + " |  " + letter + "  |");

        // print the contents of the rest of the columns in the row 
        for (int i = 1; i < rowLocations.length; i++) {
            if (rowLocations[i].player == null) {
                letter = " ";
            } else {
                letter = rowLocations[i].player.marker;
            }
            
            System.out.print("  " + letter + "  |");
        }
    }

}

