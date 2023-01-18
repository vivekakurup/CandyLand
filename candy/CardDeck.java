/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 ** Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01 - 9:00 am
 * Date: 11/13/22
 * Time: 6:10 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: Deck
 *
 * Description:
 * Represents the deck of cards used to play the game
 * ****************************************
 */

package org.candy;

import javafx.scene.image.Image;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * class representing a deck of candyland cards
 */
public class CardDeck {

    /** deck of cards to draw from in game */
    private ArrayList<Card> deck;

    /**
     * creates new deck of cards and fills it with all cards for the game
     */
    private Image backOfCard;

    /**
     * flips over the card in the deck to reveal the card the user needs to play off of
     * @param card represents the card you want to get the back of
     * @return the image of the card selected from the deck that the user should use to play
     * @throws IOException if the resource (png image) cannot be processed or opened correctly
     */
    public Image getBackOfCard(Card card) throws IOException {
        // access the number of spaces and color the card has
        String f = String.valueOf(card.getNumSpaces());
        String c = card.getColor().toString();
        // gives the pictures of cards a general filename
        String filename = f + "_" + c + ".png";
        // checks if the color of the card is pink, which represent picture cards
        if(card.getColor() == Colors.PINK)
        {
            // assigns pictures to the back of picture cards, which are considered to be special
            if(card.getNumSpaces() == 0){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("icecreamcard.png").openStream());
            }
            else if(card.getNumSpaces() == 1){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("cakecard.png").openStream());
            }
            else if(card.getNumSpaces() == 2){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("lollicard.png").openStream());
            }
            else if(card.getNumSpaces() == 3){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("candycanecard.png").openStream());
            }
            else if(card.getNumSpaces() == 4){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("yogurtcard.png").openStream());
            }
            else if(card.getNumSpaces() == 5){
                this.backOfCard = new Image(getClass().getClassLoader().getResource("cookiecard.png").openStream());
            }
        }
        // if the color of the generate card is not pink, show the picture of the card by accessing its filename
        else {
            this.backOfCard = new Image(getClass().getClassLoader().getResource(filename).openStream());
        }
        // returns the image of the back of the card to be displayed
        return backOfCard;
    }

    /**
     * constructor for a deck of cards
     * @throws IOException if the deck cannot be generated properly
     */
    public CardDeck() throws IOException {
        this.deck = generateDeck();
    }

    /**
     * randomly picks a card from the deck for the player's turn
     * removes card from deck once picked
     *
     * @return Card picked from deck
     */
    public Card pickCard() throws IOException {
        // checks if a deck has already been generated
        if (deck.size() == 0) {
            this.deck = generateDeck();
        }
        // returns a random card from the deck
        Random rand = new Random();
        int cardIndex = rand.nextInt(deck.size());
        Card card = deck.get(cardIndex);
        deck.remove(card);
        return card;
    }

    /**
     * generates full deck of cards to be drawn from
     *
     * @return ArrayList of Card objects representing a deck
     */
    private static ArrayList<Card> generateDeck() throws IOException {
        ArrayList<Card> deck = new ArrayList<Card>();
        // adds cards with one space to deck
        for (int i = 0; i < 6; i++) {
            deck.add(new Card(Colors.BLUE, 1));
            deck.add(new Card(Colors.RED, 1));
            deck.add(new Card(Colors.GREEN, 1));
            deck.add(new Card(Colors.PURPLE, 1));
            deck.add(new Card(Colors.ORANGE, 1));
            deck.add(new Card(Colors.YELLOW, 1));
        }
        // adds cards with two spaces to deck
        for (int k = 0; k < 4; k++) {
            deck.add(new Card(Colors.BLUE, 2));
            deck.add(new Card(Colors.RED, 2));
            deck.add(new Card(Colors.GREEN, 2));
            deck.add(new Card(Colors.PURPLE, 2));
            deck.add(new Card(Colors.ORANGE, 2));
            deck.add(new Card(Colors.YELLOW, 2));
        }
        // adds cards with characters
        for (int j = 0; j < 6; j++) {
            deck.add(new Card(Colors.PINK, j));
        }
        // returns a deck of cards to play the game with
        return deck;
    }

    /**
     * @return ArrayList of Cards representing deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /** shuffles the deck of cards that have been generated */
    public void shuffle(){
        Collections.shuffle(deck);
    }





}
