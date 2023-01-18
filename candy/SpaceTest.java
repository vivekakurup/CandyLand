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
 * Class: SpaceTest
 *
 * Description:
 * A test class for Space
 * ****************************************
 */

package org.candy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for Space
 */
class SpaceTest {

    /** represents a space on the board */
    private Space space1;

    /** represents a space on the board */
    private Space space2;

    /** represents a space on the board */
    private Space space3;

    /**
     * Sets up the spaces on the board before each test
     */
    @BeforeEach
    void setUp() {
        space1 = new Space(Colors.BLUE, spaceType.NORMAL);
        space2 = new Space(Colors.GREEN, spaceType.LICORICE);
        space3 = new Space(Colors.RED, spaceType.BRIDGE);
    }

    /**
     * simple test for the setSpaceType method that changes the spaceType to the given one
     */
    @Test
    void setSpaceType() {
        assertEquals(space1.getType(), spaceType.NORMAL);

        //set type to bridge and check that it worked
        space1.setSpaceType(spaceType.BRIDGE);
        assertEquals(space1.getType(), spaceType.BRIDGE);

    }

    /**
     * a simple test for the setSpaceColor method that changes the color of the space
     */
    @Test
    void setSpaceColor() {
        assertEquals(space1.getColor(), Colors.BLUE);
        space1.setSpaceColor(Colors.GREEN);
        assertEquals(space1.getColor(), Colors.GREEN);
    }

    /**
     * simple test for the isLicorice method that returns true when the spaceType is Licorice
     */
    @Test
    void isLicorice() {
        assertTrue(space2.isLicorice());

        assertFalse(space3.isLicorice());
    }

    /**
     * simple test for the isBridge method that returns true if a given space is a bridge
     */
    @Test
    void isBridge() {
        assertTrue(space3.isBridge());
        assertFalse(space2.isBridge());
    }
}