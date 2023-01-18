/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01
 * Date: 11/27/22
 * Time: 10:41 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: CandyLand
 *
 * Description:
 * Represents a game of candy land
 * ****************************************
 */
package org.candy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * class representing a game of candyland
 */
public class CandyLand {

    /** an arraylist that keep tracks of each player of the game */
    private static ArrayList<Player> playerList;

    /** represent the player that wins the game */
    private static Player winner;

    /** represents the deck of cards used to play the game and move spaced */
    private static CardDeck deck;

    /** represents an instance of the game board to be played on */
    private static GameBoard board;

    /**
     * @return an arraylist of player objects that keep tracks of each player of the game
     */
    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
     * constructor for the Candy land class
     * @throws IOException if players cannot be generated properly
     */
    public CandyLand() throws IOException {
        board = new GameBoard();
        deck = new CardDeck();
        generatePlayers();
    }

    /**
     * main method for candy land game
     * @param args
     * @throws IOException if the game cannot be loaded or played properly
     */
    public static void main(String[] args) throws IOException {
        CandyLand game = new CandyLand();
        playGame(game.deck);

        System.out.println(winner.getName() + " u win yay!"); //javafx stuff
    }

    /**
     * method that drives main gameplay, loops through all players until someone wins
     * @param deck - deck of cards to be used in the game
     */
    private static void playGame(CardDeck deck) throws IOException {

        while (isGameOver() == false) {
            for (int k = 0; k < playerList.size(); k++) {
                Player currPlayer = playerList.get(k);
                if (currPlayer.getState().equals(Player.playerState.WINNER)){
                    break;
                }
                else if (!currPlayer.getState().equals(Player.playerState.SKIP_TURN)) {
                    currPlayer.changeState(Player.playerState.CURRENT_TURN);
                }
                else{
                    currPlayer.changeState(Player.playerState.NOT_TURN);
                }
                currPlayer.takeTurn(deck);
            }
        }
    }

    /**
     * generates 4 default player objects and adds them into an ArrayList
     */
    private static void generatePlayers() {
        Player player1 = new Player("Alfred", new GingerbreadPawn("blue"));
        player1.changeState(Player.playerState.CURRENT_TURN);
        Player player2 = new Player("Jenny", new GingerbreadPawn("yellow"));
        Player player3 = new Player("Richard", new GingerbreadPawn("green"));
        Player player4 = new Player("Eleanor", new GingerbreadPawn("red"));

        playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
    }

    /**
     * checks if any of the players are winners
     * @return true if a winner exists
     */
    public static boolean isGameOver(){
        for (int k = 0; k < playerList.size(); k++)
        {
            Player currPlayer = playerList.get(k);
            if (currPlayer.getState() == Player.playerState.WINNER){
                winner = currPlayer;
                return true;
            }
        }
        return false;
    }
}
