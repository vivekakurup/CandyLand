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
 * Class: initScreenController
 *
 * Description:
 * controls events and actions that occur on the game board
 * ****************************************
 */

package org.candy;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/** Controller class for the fxml screen */
public class initSceneController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="playBtn"
    private Button playBtn; // Value injected by FXMLLoader

    @FXML // fx:id="welcomeLbl"
    private Label welcomeLbl; // Value injected by FXMLLoader

    /** stage used to generate scenes and switch to different screens */
    private Stage stage;

    /** used to set scenes for different screens */
    private Scene scene;

    /** root used to load in the fxml files */
    private Parent root;

    /** represents the pawn for player1 and is blue */
    private GingerbreadPawn piece1 = new GingerbreadPawn("blue");

    /** represents player1 of the game */
    private Player player1 = new Player("player1", piece1);

    /** the pawn used to represent player1 */
    @FXML
    private Circle pawn1 = player1.getCircle();

    /** next card button that generates a new card from the deck */
    @FXML
    private Button button;

    /** represents an image of the back of card generated from the deck */
    @FXML
    private javafx.scene.image.ImageView backOfCard;

    /** represents the deck of cards used to play the game */
    private CardDeck deck;

    /** represents individual cards from the game */
    private Card card;

    /** represents the color of the space the player should move to next */
    private Colors correct_color;

    /** represents the index of the space the player should move to */
    private int correct_space;


    private GameBoard board = new GameBoard();

    /** represents the first space on the board as a rectangle */
    @FXML
    private Rectangle r0;

    /** represents the second space on the board as a rectangle */
    @FXML
    private Rectangle r1;

    /** represents the 11th space on the board as a rectangle */
    @FXML
    private Rectangle r10;

    /** represents the 12th space on the board as a rectangle */
    @FXML
    private Rectangle r11;

    /** represents the 13th space on the board as a rectangle */
    @FXML
    private Rectangle r12;

    /** represents the 14th space on the board as a rectangle */
    @FXML
    private Rectangle r13;

    /** represents the 15th space on the board as a rectangle */
    @FXML
    private Rectangle r14;

    /** represents the 16th space on the board as a rectangle */
    @FXML
    private Rectangle r15;

    /** represents the 17th space on the board as a rectangle */
    @FXML
    private Rectangle r16;

    /** represents the 18th space on the board as a rectangle */
    @FXML
    private Rectangle r17;

    /** represents the 19th space on the board as a rectangle */
    @FXML
    private Rectangle r18;

    /** represents the 20th space on the board as a rectangle */
    @FXML
    private Rectangle r19;

    /** represents the 3rd space on the board as a rectangle */
    @FXML
    private Rectangle r2;

    /** represents the 21st space on the board as a rectangle */
    @FXML
    private Rectangle r20;

    /** represents the 22nd space on the board as a rectangle */
    @FXML
    private Rectangle r21;

    /** represents the 23rd space on the board as a rectangle */
    @FXML
    private Rectangle r22;

    /** represents the 24th space on the board as a rectangle */
    @FXML
    private Rectangle r23;

    /** represents the 25th space on the board as a rectangle */
    @FXML
    private Rectangle r24;

    /** represents the 26th space on the board as a rectangle */
    @FXML
    private Rectangle r25;

    /** represents the 27th space on the board as a rectangle */
    @FXML
    private Rectangle r26;

    /** represents the 28th space on the board as a rectangle */
    @FXML
    private Rectangle r27;

    /** represents the 29th space on the board as a rectangle */
    @FXML
    private Rectangle r28;

    /** represents the 30th space on the board as a rectangle */
    @FXML
    private Rectangle r29;

    /** represents the 4th space on the board as a rectangle */
    @FXML
    private Rectangle r3;

    /** represents the 31st space on the board as a rectangle */
    @FXML
    private Rectangle r30;

    /** represents the 32nd space on the board as a rectangle */
    @FXML
    private Rectangle r31;

    /** represents the 33rd space on the board as a rectangle */
    @FXML
    private Rectangle r32;

    /** represents the 34th space on the board as a rectangle */
    @FXML
    private Rectangle r33;

    /** represents the 35th space on the board as a rectangle */
    @FXML
    private Rectangle r34;

    /** represents the 36th space on the board as a rectangle */
    @FXML
    private Rectangle r35;

    /** represents the 37th space on the board as a rectangle */
    @FXML
    private Rectangle r36;

    /** represents the 38th space on the board as a rectangle */
    @FXML
    private Rectangle r37;

    /** represents the 39th space on the board as a rectangle */
    @FXML
    private Rectangle r38;

    /** represents the 40th space on the board as a rectangle */
    @FXML
    private Rectangle r39;

    /** represents the 5th space on the board as a rectangle */
    @FXML
    private Rectangle r4;

    /** represents the 41st space on the board as a rectangle */
    @FXML
    private Rectangle r40;

    /** represents the 42nd space on the board as a rectangle */
    @FXML
    private Rectangle r41;

    /** represents the 43rd space on the board as a rectangle */
    @FXML
    private Rectangle r42;

    /** represents the 44th space on the board as a rectangle */
    @FXML
    private Rectangle r43;

    /** represents the 45th space on the board as a rectangle */
    @FXML
    private Rectangle r44;

    /** represents the 46th space on the board as a rectangle */
    @FXML
    private Rectangle r45;

    /** represents the 47th space on the board as a rectangle */
    @FXML
    private Rectangle r46;

    /** represents the 48th space on the board as a rectangle */
    @FXML
    private Rectangle r47;

    /** represents the 49th space on the board as a rectangle */
    @FXML
    private Rectangle r48;

    /** represents the 50th space on the board as a rectangle */
    @FXML
    private Rectangle r49;

    /** represents the 6th space on the board as a rectangle */
    @FXML
    private Rectangle r5;

    /** represents the 51st space on the board as a rectangle */
    @FXML
    private Rectangle r50;

    /** represents the 7th space on the board as a rectangle */
    @FXML
    private Rectangle r6;

    /** represents the 8th space on the board as a rectangle */
    @FXML
    private Rectangle r7;

    /** represents the 9th space on the board as a rectangle */
    @FXML
    private Rectangle r8;

    /** represents the 10th space on the board as a rectangle */
    @FXML
    private Rectangle r9;

    /** represents an arraylist of rectangles that make up the game board */
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    private Image background;


    // This method is called by the FXMLLoader when initialization is complete
    @FXML
    void initialize() throws IOException {
        assert playBtn != null : "fx:id=\"playBtn\" was not injected: check your FXML file 'initScreen.fxml'.";
        assert welcomeLbl != null : "fx:id=\"welcomeLbl\" was not injected: check your FXML file 'initScreen.fxml'.";
        deck = new CardDeck();
        deck.shuffle();
        this.card = deck.pickCard();
        this.player1.changeState(Player.playerState.CURRENT_TURN);
    }

    /**
     * switches the current scene to scene3 (the final game board)
     * @param event - represents the action of the user pressing the play button
     * @throws IOException - throws if the fxml scene cannot be loaded properly
     */
    public void switchToScene3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/final/finalBoard.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * switches the current scene to scene2 (the candy land gif )
     * @param event - represents the action of the user pressing the play button
     * @throws IOException - throws if the fxml scene cannot be loaded properly
     */
    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/final/scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    /**
     * A method that generates a pop-up window that allows users to view the instructions for the game
     * @param event - the event when the user clicks the instructions button
     * @throws IOException
     */
    @FXML
    private void generateInstructions(ActionEvent event) throws IOException {
        // creates a new stage to put the instructions on
        stage = new Stage();
        // creates a Vbox where the instructions will be inside and centers it
        VBox box = new VBox();
        box.setAlignment(Pos.TOP_CENTER);

        // Creates a font for the instruction
        Font font = new Font("Arial", 24);
        // Creates a title for the top of the pop-up window
        Label title = new Label("Instructions: How to Play Candyland!");
        title.setFont(font);

        Font textFont = new Font("Arial", 14);

        // creates all the instructions and sets their fonts
        Text instruct1 = new Text("1. Click the pick button to generate a card with the space or spaces to move to");
        instruct1.setFont(textFont);

        Text instruct2 = new Text("2. Move the pawn, which is shaped as a circle, to the next rectangle that is same color as the card that is drawn");
        instruct2.setFont(textFont);

        Text instruct3 = new Text("3. If the card drawn has two spaces on it, move forward to two rectangles of the specified color");
        instruct3.setFont(textFont);

        Text instruct4 = new Text("4. If your card take you to a bridge, click the space above of the bridge, which will be your new position");
        instruct4.setFont(textFont);

        Text instruct5 = new Text("5. If you draw a picture card, move to the rectangle that contains the matching picture");
        instruct5.setFont(textFont);

        Text instruct6 = new Text("6. If you draw a picture card and the space is behind your pawn on the game board, you must move backwards");
        instruct6.setFont(textFont);

        Text instruct7 = new Text("7. When clicking on spaces with pictures, click on the border/edges of the spaces");
        instruct7.setFont(textFont);

        Text instruct8 = new Text("8. If you land on the rainbow space, you win the game!");
        instruct8.setFont(textFont);

        Text instruct9 = new Text("9. Rerun the program if you would like to play again!");
        instruct9.setFont(textFont);

        Text goodLuck = new Text("Make sure you follow these instructions carefully! HAVE FUN!");
        goodLuck.setFont(textFont);

        // adds the title and instructions to the Vbox
        box.getChildren().add(title);
        box.getChildren().add(instruct1);
        box.getChildren().add(instruct2);
        box.getChildren().add(instruct3);
        box.getChildren().add(instruct4);
        box.getChildren().add(instruct5);
        box.getChildren().add(instruct6);
        box.getChildren().add(instruct7);
        box.getChildren().add(instruct8);
        box.getChildren().add(instruct9);
        box.getChildren().add(goodLuck);

        // creates the new scene for the pop-up window
        Scene scene = new Scene(box, 750, 200);
        stage.setScene(scene);
        stage.show();
    }


    /**
     * get the next card in the deck of cards being used in the game
     * @throws IOException - throws if the card cannot be picked properly or the back of the card cannot be accessed
     */
    @FXML
    public Card getNextCard() throws IOException {
        // picks a random card from the deck and sets the back of the card to its matching image
        this.card = deck.pickCard();
        backOfCard.setImage(deck.getBackOfCard(card));

        // accesses the color of the card picked by the user
        this.correct_color = this.card.getColor();
        // checks if the color is a character space and moves accordingly
        if (this.correct_color == Colors.PINK){
            this.correct_space = piece1.moveToCharacter(this.card.getNumSpaces());
        }
        // checks if the card picks wants to the user to move two spaces, calling the move method twice
        else if (this.card.getNumSpaces() == 2) {
            this.correct_space = piece1.move(correct_color);
            this.correct_space = piece1.move(correct_color);
        }
        // if the card is normal have it to move to the correct colored
        else {
            this.correct_space = piece1.move(correct_color);
        }
        // returns the card the user should use to make their next move
        return this.card;
    }

    /**
     * takes in where the user clicks to move the pawn and check if their input matches the actual space they are supposed to go to
     * @param e - the mouse event initiated by the user
     * @throws IOException
     * @throws InterruptedException
     */
    public void moveCircle(MouseEvent e) throws IOException, InterruptedException {
        // calls setRectangles to add all the rectangles on the board to an array list
        setRectangles();
        // marks the original spot the player started at the beginning of their turn
        double originX = pawn1.getLayoutX();
        double originY = pawn1.getLayoutY();

        // sets the location of the pawn based on where the user clicks on the screen
        pawn1.setLayoutX(e.getX());
        pawn1.setLayoutY(e.getY());

        // checks if the space the user clicks is the rectangle it should be at based on the card drawn at the start of the turn
        if (e.getTarget().equals(this.rectangles.get(correct_space))) {
            if (this.rectangles.get(correct_space) == this.rectangles.get(11) ||
                    this.rectangles.get(correct_space) == this.rectangles.get(29) ||
                    this.rectangles.get(correct_space) == this.rectangles.get(41)) {
                Stage stage = new Stage();
                StackPane pane = new StackPane();
                stage.setTitle("You Landed on a Licorice Space!!!");
                Label label = new Label("Welcome to the licorice spot: Looks like you're stuck in a sticky situation");
                pane.getChildren().add(label);
                Scene scene = new Scene(pane, 400, 200);
                stage.setScene(scene);
                stage.show();
            }
            // checks if the user makes it to the final space and generates a pop-up window telling them they won
            if (e.getTarget().equals(this.rectangles.get(50))) {
                stage = new Stage();
                stage.setTitle("WINNER! WINNER! WINNER!");
                VBox box = new VBox();
                box.setAlignment(Pos.TOP_CENTER);

                Text text = new Text("CONGRATS! YOU HAVE WON THE GAME!");
                Text text2 = new Text("Please play again soon!");
                Text text3 = new Text("Multiplayer Version Coming Soon!");

                Font font = new Font("Arial", 18);
                text.setFont(font);
                text2.setFont(font);
                text3.setFont(font);

                box.getChildren().add(text);
                box.getChildren().add(text2);
                box.getChildren().add(text3);

                Scene scene = new Scene(box, 400, 100);
                stage.setScene(scene);
                stage.show();
            }
        } else if (correct_space > 51) {
            System.out.println("You have won the game!");
        } else {
            // generates a pop-up window that tell the user they did not click the correct space based on the card generate
            Stage stage = new Stage();
            StackPane pane = new StackPane();
            Label label = new Label("You did not move to the correct space! Please try again!");
            pane.getChildren().add(label);
            Scene scene = new Scene(pane, 400, 200);
            stage.setScene(scene);
            stage.show();
            // brings the users back to their original spot if they click the wrong space on their turn
            pawn1.setLayoutX(originX);
            pawn1.setLayoutY(originY);
        }
    }


    /**
     * adds each individual rectangle to the arraylist rectangles
     */
    private void setRectangles() {
        this.rectangles.add(r0);
        this.rectangles.add(r1);
        this.rectangles.add(r2);
        this.rectangles.add(r3);
        this.rectangles.add(r4);
        this.rectangles.add(r5);
        this.rectangles.add(r6);
        this.rectangles.add(r7);
        this.rectangles.add(r8);
        this.rectangles.add(r9);
        this.rectangles.add(r10);
        this.rectangles.add(r11);
        this.rectangles.add(r12);
        this.rectangles.add(r13);
        this.rectangles.add(r14);
        this.rectangles.add(r15);
        this.rectangles.add(r16);
        this.rectangles.add(r17);
        this.rectangles.add(r18);
        this.rectangles.add(r19);
        this.rectangles.add(r20);
        this.rectangles.add(r21);
        this.rectangles.add(r22);
        this.rectangles.add(r23);
        this.rectangles.add(r24);
        this.rectangles.add(r25);
        this.rectangles.add(r26);
        this.rectangles.add(r27);
        this.rectangles.add(r28);
        this.rectangles.add(r29);
        this.rectangles.add(r30);
        this.rectangles.add(r31);
        this.rectangles.add(r32);
        this.rectangles.add(r33);
        this.rectangles.add(r34);
        this.rectangles.add(r35);
        this.rectangles.add(r36);
        this.rectangles.add(r37);
        this.rectangles.add(r38);
        this.rectangles.add(r39);
        this.rectangles.add(r40);
        this.rectangles.add(r41);
        this.rectangles.add(r42);
        this.rectangles.add(r43);
        this.rectangles.add(r44);
        this.rectangles.add(r45);
        this.rectangles.add(r46);
        this.rectangles.add(r47);
        this.rectangles.add(r48);
        this.rectangles.add(r49);
        this.rectangles.add(r50);
    }

}







