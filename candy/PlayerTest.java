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
 * Class: PlayerTest
 *
 * Description:
 * A test class for Player
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for Player
 */
class PlayerTest {

    /** represents the board of the game */
    private GameBoard board;

    /** represents the spaces on the board */
    private ArrayList<Space> spaces;

    /** represents one player of the game */
    private Player player1;

    /** represent a player of the game */
    private Player player2;

    /** represents the deck of cards needed to play the game */
    private CardDeck deck;

    /**
     * sets up the board, spaces, players, and deck before each test
     * @throws IOException
     */
    @BeforeEach
    void setUp() throws IOException {
        board = new GameBoard();
        spaces = board.getBoard();
        deck = new CardDeck();
        player1 = new Player("Claire", new GingerbreadPawn("blue"));
        player2 = new Player("Alexa", new GingerbreadPawn("yellow"));
    }

    /**
     * simple test for a single turn in the game
     */
    @Test
    void takeTurn() throws IOException {
        // change state of player 1 to make it their turn
        player1.changeState(Player.playerState.CURRENT_TURN);
        // store original position of pawn
        Space original = player1.getPiece().getCurrSpace();
        player1.takeTurn(deck);
        // check to make sure pawn moved
        assertNotEquals(original, player1.getPiece().getCurrSpace());
        // check state at the end of turn
        assertEquals(player1.getState(), Player.playerState.NOT_TURN);

        for (int i = 0; i < 500; i++) {
            player2.takeTurn(deck);
        }
        assertEquals(Player.playerState.WINNER, player2.getState());
    }

    /**
     * simple test for the changeState
     */
    @Test
    void changeState() {
        assertEquals(player1.getState(), Player.playerState.NOT_TURN);
        assertEquals(player2.getState(), Player.playerState.NOT_TURN);

        //change state of player1 and check
        player1.changeState(Player.playerState.CURRENT_TURN);
        assertEquals(player1.getState(), Player.playerState.CURRENT_TURN);

        //check state of player2 and check
        player2.changeState(Player.playerState.WINNER);
        assertEquals(player2.getState(), Player.playerState.WINNER);
    }

    /**
     * simple test for getState method
     */
    @Test
    void getState() {
        //checks that players all start as NOT_TURN
        assertEquals(player1.getState(), Player.playerState.NOT_TURN);
        assertEquals(player2.getState(), Player.playerState.NOT_TURN);
    }

    /**
     * simple test for the getName method
     */
    @Test
    void getName() {
        assertEquals(player1.getName(), "Claire");
        assertFalse(player1.getName()== "LukeC");

        assertEquals(player2.getName(), "Alexa");
    }
}