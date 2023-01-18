/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Viveka Kurup, and Claire Engel
 * Section: 01
 * Date: 11/9/22* Time: 6:46 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: Players
 *
 * Description:
 * Represents a player of the game
 * ****************************************
 */
package org.candy;

import javafx.scene.shape.Circle;
import java.io.IOException;

/**
 * class representing human player
 */
public class Player {

   /**
    * enumeration representing state of player throughout the game
    */
   public enum playerState {
      CURRENT_TURN, NOT_TURN, SKIP_TURN, WINNER
   }
   /** name of player to be shown on gamepiece */
   private String name;

   /** gingerbread piece representing the player on the gameboard */
   private GingerbreadPawn piece;

   /** state of player */
   private playerState state;

   /** represents the shape the player is represented as on the game board */
   public Circle playerShape;

   /**
    * @return the shape of the player as it is represented in the game
    */
   public Circle getPlayerShape() {
      return playerShape;
   }

   /**
    * constructor for player
    * @param playerName - name
    * @param gamePiece - gingerbread man
    */
   public Player(String playerName, GingerbreadPawn gamePiece) {
      this.state = playerState.NOT_TURN;
      this.name = playerName;
      this.piece = gamePiece;
      this.playerShape = new Circle();
   }

   /**
    * method representing a turn in the game
    * @param deck - card deck being used in the game
    */
   public void takeTurn(CardDeck deck) throws IOException {
      if (this.state.equals(playerState.CURRENT_TURN)) {
         // pick card
         Card cardPicked = deck.pickCard();
         // get color and number of spaces
         Colors nextColor = cardPicked.getColor();
         int numMoves = cardPicked.getNumSpaces();

         // card is character card, different moves
         if (nextColor.equals(Colors.PINK)) {
            piece.moveToCharacter(numMoves);
         }
         // move piece (use move forward/backwards)
         else {
            piece.move(nextColor);
         }

         if (this.piece.getCurrSpace().isLicorice()){
            //skip next turn if player is on licorice space
            changeState(playerState.SKIP_TURN);
         }
         else if (this.piece.getCurrSpace().getType() == spaceType.RAINBOW){
            changeState(playerState.WINNER);
         }
         else {
            // turn is over, change state
            changeState(playerState.NOT_TURN);
         }
      }
   }

   /**
    * changes the state of the player
    * @param newState
    */
   public void changeState(playerState newState) {
      this.state = newState;
   }

   /**
    * @return state of the current
    */
   public playerState getState(){
      return this.state;
   }

   /**
    * @return name of the current player
    */
   public String getName(){
      return this.name;
   }

   /**
    * @return the player's pawn
    */
   public GingerbreadPawn getPiece() { return this.piece; }

   /**
    * @return the circle representing the pawn
    */
   public Circle getCircle() { return this.playerShape;}

}
