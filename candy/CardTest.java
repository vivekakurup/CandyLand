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
 * Package: PACKAGE_NAME
 * Class: CardTest
 *
 * Description:
 * A test class for Card
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for Card
 */
public class CardTest {

    /** Represents a card in the game */
    private Card card1;

    /** Represents a card in the game */
    private Card card2;

    /**
     * Initializes two cards before each test, each with a different color and number of spaces
     * @throws IOException
     */
    @BeforeEach
    void setUp() throws IOException {
        card1 = new Card(Colors.ORANGE, 1);
        card2 = new Card(Colors.BLUE, 2);
    }

    /**
     *simple test for the color getter method
     */
    @Test
    void getColor(){
        assertEquals(card1.getColor(), Colors.ORANGE);
        assertEquals(card2.getColor(), Colors.BLUE);
    }

    /**
     * simple test for the getNumSpaces() getter method
     */
    @Test
    void getNumSpaces(){
        assertEquals(card1.getNumSpaces(), 1);
        assertEquals(card2.getNumSpaces(), 2);

    }

}