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
 * Class: GameBoardTest
 *
 * Description:
 * A test class for GameBoard
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    /** Represents a gameboard object that serves as a backend tool for the actual board*/
    private GameBoard board;

    /**
     * Creates a board before each test
     */
    @BeforeEach
    void setUp() {
        board = new GameBoard();
    }

    /**
     * simple test for getBoard to show that a filled ArrayList is returned
     */
    @Test
    void getBoard() {
        assertNotEquals(board.getBoard(), null);
        for (int i = 0; i < board.getBoard().size(); i++) {
            System.out.println(board.getBoard().get(i).getColor());
        }
    }
}