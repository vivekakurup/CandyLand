/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall 2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01 - 9am
 * Date: 11/10/22
 * Time: 2:28 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: CandyLandTest
 *
 * Description:
 * A test class for CandyLand
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for CandyLand
 */
class CandyLandTest {

    /** game object */
    private CandyLand game;

    /**
     * sets up a game object before each test
     * @throws IOException
     */
    @BeforeEach
    void setUp() throws IOException{
        game = new CandyLand();
    }

    /**
     * simple test for isGameOver method that ends the game when a player is a winner
     */
    @Test
    void isGameOver() {
        //checks that game is not over at beginning
        assertFalse(game.isGameOver());

        //sets a player's state to winner
        ArrayList<Player> playerList = game.getPlayerList();
        Player player1 = playerList.get(1);
        player1.changeState(Player.playerState.WINNER);

        //check that game is now over
        assertTrue(game.isGameOver());

    }
}