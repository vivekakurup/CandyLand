/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 ** Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01 - 9:00 am
 * Date: 11/13/22
 * Time: 6:56 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: CardDeckTest
 *
 * Description:
 * A test class for CardDeck
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for CardDeck
 */
public class CardDeckTest {

    @BeforeEach
    void setUp(){

    }

    /**
     * tests that a card deck is generated properly
     * @throws IOException
     */
    @Test
    void testGenerateDeck() throws IOException {
        CardDeck deck = new CardDeck();
    }

    /**
     * simple test to check that pickCard() returns a valid card object
     */
    @Test
    void testPickCard() throws IOException {
        CardDeck deck = new CardDeck();
        Card card = deck.pickCard();

        assertEquals(card.getClass(), Card.class);
    }
}