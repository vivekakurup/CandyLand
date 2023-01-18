/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 ** Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01 - 9:00 am
 * Date: 11/21/22
 * Time: 3:12 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: GingerbreadPawn
 *
 * Description:
 * Represents the pawn in the game
 * ****************************************
 */

package org.candy;

import java.util.ArrayList;

/**
 * Represents a ginger bread pawn that plays the game
 */
public class GingerbreadPawn {
    /** Represents the color of the pawn */
    private String color;

    /** Represents the current space the pawn is located at */
    private Space currSpace;

    /** Represents the current index of the pawn */
    private int currIndex;

    /** Represents an arraylist of the spaces that make up the board */
    private ArrayList<Space> board;

    /**
     * constructor for ginger bread pawns
     * @param color - the color of the pawn
     */
    public GingerbreadPawn(String color) {
        this.color = color;
        // characters start at the first space
        this.board = GameBoard.getBoard();
        this.currIndex = 0;
    }

    /**
     * indicates where the pawn should be moved to when cards are drawn
     * @param spaceColor - the color of the space that the pawn should be moved to
     * @return the index the pawn should be moved to
     */
    public int move(Colors spaceColor) {
        // update the current index that pawn is supposed to be at when a card is drawn
        do {
            this.currIndex++;
            this.currSpace = this.board.get(currIndex);

            if (this.currSpace.getColor()== Colors.RAINBOW){
                return 50;
            }
        } while(this.currSpace.getColor() != spaceColor);

        // different movement for bridge
        if (this.currSpace.getType().equals(spaceType.BRIDGE)) {
            if(this.currSpace == this.board.get(2)){
                this.currIndex = 17;
                this.currSpace = this.board.get(currIndex);
            }
            else{
                this.currIndex = 39;
                this.currSpace = this.board.get(currIndex);
            }
        }
        // returns the currIndex the pawn should be at when a card is drawn
        return currIndex;
    }

    /**
     * moves piece to the character space on the board
     * @param characterNum - number representing the character to move to
     */
    public int moveToCharacter(int characterNum) {
        // indicates where the pawn should be moved to when character cards are drawn
        switch (characterNum) {
            case 0:
                // jolly
                this.currSpace = GameBoard.getBoard().get(8);
                this.currIndex = 8;
                break;
            case 1:
                // mr. mint
                this.currSpace = GameBoard.getBoard().get(15);
                this.currIndex = 15;
                break;
            case 2:
                // princess lolly
                this.currSpace = GameBoard.getBoard().get(24);
                this.currIndex = 24;
                break;
            case 3:
                // grandma nut
                this.currSpace = GameBoard.getBoard().get(33);
                this.currIndex = 33;
                break;
            case 4:
                // queen frostine
                this.currSpace = GameBoard.getBoard().get(39);
                this.currIndex = 39;
                break;
            case 5:
                // gloppy
                this.currSpace = GameBoard.getBoard().get(43);
                this.currIndex = 43;
                break;
        }
        return currIndex;
    }

    /**
     * @return current space
     */
    public Space getCurrSpace(){
        return this.currSpace;
    }
}