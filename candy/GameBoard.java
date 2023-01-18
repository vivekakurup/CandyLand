/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01
 * Date: 11/9/22
 * Time: 6:45 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: GameBoard
 *
 * Description:
 * Represents the game board of candy land
 * ****************************************
 */

package org.candy;

import java.util.ArrayList;

/**
 * class representing game board
 */
public class GameBoard {

    /** arraylist containing spaces on the board */
    public static ArrayList<Space> board;

    /**
     * constructs game board object
     */
    public GameBoard(){
        board = generateBoard();
    }

    /**
     * generates a list of spaces representing the gameboard
     * @return ArrayList<Space>
     */
    public ArrayList<Space> generateBoard() {
        // set up initial game board with only normal spaces
        ArrayList<Space> spaces = new ArrayList<Space>();

        //make 51 spaces
        for (int i = 0; i < 9; i ++) {
            spaces.add(new Space(Colors.RED, spaceType.NORMAL));
            spaces.add(new Space(Colors.PURPLE, spaceType.NORMAL));
            spaces.add(new Space(Colors.YELLOW, spaceType.NORMAL));
            if (i < 8) {
                spaces.add(new Space(Colors.BLUE, spaceType.NORMAL));
                spaces.add(new Space(Colors.ORANGE, spaceType.NORMAL));
                spaces.add(new Space(Colors.GREEN, spaceType.NORMAL));
            }
        }

        //adding all characters
        Space characterSpace = new Space(Colors.PINK, spaceType.NORMAL);
        //character = ice cream
        spaces.set(8, characterSpace);
        //character = chocolate
        spaces.set(15, characterSpace);
        //character =Princess Lolly
        spaces.set(24, characterSpace);
        //character = Mr. Mint
        spaces.set(33, characterSpace);
        //character =cupcake
        spaces.set(39, characterSpace);
        //character = Gloppy the Chocolate Monster
        spaces.set(43, characterSpace);

        //add 2 bridges
        spaces.get(2).setSpaceType(spaceType.BRIDGE);
        spaces.get(25).setSpaceType(spaceType.BRIDGE);

        // add licorice spaces
        spaces.get(11).setSpaceType(spaceType.LICORICE);
        spaces.get(29).setSpaceType(spaceType.LICORICE);
        spaces.get(41).setSpaceType(spaceType.LICORICE);

        // rainbow space at the end
        spaces.get(spaces.size()-1).setSpaceColor(Colors.RAINBOW);
        spaces.get(spaces.size()-1).setSpaceType(spaceType.RAINBOW);

        return spaces;
    }

    /**
     * @return arraylist of spaces representing the gameboard
     */
    public static ArrayList<Space> getBoard() {
        return board;
    }
}



