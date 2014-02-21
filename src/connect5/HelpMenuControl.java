/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect5;

/**
 *
 * @author Aluminium
 */
class HelpMenuControl {

    public HelpMenuControl() {
    }

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tThe game board for connect4. It consist of a grid of "
                + "\n\tlocations. Players place their marker on the different locations "
                + "\n\ton the board in an effort to win the game. The default board is "
                + "\n\t6 rows by 7 columns.");
        displayHelpBorder();
    }

    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThe objective of the game is to be the first player to mark four "
                + "\n\tsquares vertically, horizontally or diagonally. Each player takes "
                + "\n\tturns placing their marker in one of the locations on the "
                + "\n\tboard. The first player to get \"four-in-a-row\" is the winner.");
        displayHelpBorder();
    }

    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA real player manually takes their turn by placing their mark "
                + "\n\tin an unused location on the board.");
        displayHelpBorder();
    }

    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA location on the board where a player can place their marker");
        displayHelpBorder();
    }

    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by the player. "
                + "\n\tThe default markers are \"r\" and \"b\".");
        displayHelpBorder();
    }

    public void displayHelpBorder() {
        System.out.println(
                "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}