/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01
 * Date: 11/9/22* Time: 6:44 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: Cards
 *
 * Description:
 * Represents a card in the deck
 * ****************************************
 */
package org.candy;

import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;

/**
 * Card class that generates individual cards for gameplay
 */
public class Card {
    /** color of card */
    private Colors color;

    /** number of spaces on card
     * for pink cards, the number represents the character on the card
     * 0=Jolly
     * 1=Mr. Mint
     * 2=Princess Lolly
     * 3=Grandma Nut
     * 4=Queen Frostine
     * 5=Gloppy the Chocolate Monster
     */
    private int numSpaces;



    /**
     * card constructor
     * @param color -  the color of the card
     * @param numSpaces - number of colored spaces on the card/character for pink cards
     */
    public Card(Colors color, int numSpaces) throws IOException {
        this.color = color;
        this.numSpaces = numSpaces;
    }

    /**
     * @return the color of the current card
     */
    public Colors getColor() {
        return color;
    }

    /**
     * @return number of spaces on the card
     */
    public int getNumSpaces() {
        return numSpaces;
    }
}



