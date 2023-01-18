/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01 - 9:00 am
 * Date: 11/13/22
 * Time: 6:51 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: GingerbreadPawnTest
 *
 * Description:
 * A test class for GingerbreadPawn
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for GingerbreadPawn
 */
class GingerbreadPawnTest {

    /** Represents a pawn in the game */
    private GingerbreadPawn pawn;

    /** Represents the board of the game */
    private GameBoard board;

    /** Represents the spaces on the board */
    private ArrayList<Space> spaces;

    /**
     * Sets up a board, the spaces, and a pawn before each test
     */
    @BeforeEach
    void setUp() {
        board = new GameBoard();
        pawn = new GingerbreadPawn("blue");
        spaces = board.getBoard();
    }

    /**
     * simple test for the move method that
     * sends the player to the appropriate new
     * space based on their card
     */
    @Test
    void move() {
        // check that pawn starts in the first space
        assertEquals(pawn.getCurrSpace(), spaces.get(0));

        // move to the next green space
        pawn.move(Colors.GREEN);

        // check color of space
        assertEquals(pawn.getCurrSpace().getColor(), Colors.GREEN);

        //move to blue space
        pawn.move(Colors.BLUE);

        // check color of space
        assertEquals(pawn.getCurrSpace().getColor(), Colors.BLUE);
    }

    /**
     * simple test for the moveToCharacter method that
     * sends players to special character spaces when drawn
     */
    @Test
    void moveToCharacter() {
        assertEquals(pawn.getCurrSpace(), spaces.get(0));

        //move to mr.mint and check
        pawn.moveToCharacter(1);

        assertEquals(pawn.getCurrSpace(), spaces.get(30));

        //move to grandma nut and check
        pawn.moveToCharacter(3);
        assertEquals(pawn.getCurrSpace(), spaces.get(70));

    }

    /**
     * simple test for getCurrSpace method that checks the current space of the pawn is returned
     */
    @Test
    void getCurrSpace() {
        // check that player starts in the first space
        Space first = spaces.get(0);
        assertEquals(pawn.getCurrSpace(), first);

        // move pawn
        pawn.moveToCharacter(1);

        // check that the player is on the Mr. mint space
        Space mint = spaces.get(30);
        assertEquals(pawn.getCurrSpace(), mint);
    }
}