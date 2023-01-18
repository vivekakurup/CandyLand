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
 * Class: initSceneMain
 *
 * Description:
 * launches the whole program
 * ****************************************
 */

package org.candy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class initSceneMain extends Application {

    /**
     * launches the game
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * launches the program and accesses the initial candy land scene
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {

        // Load the FXML file. Obtain the root of the scene graph
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/final/scene2.fxml"));
        Parent root = loader.load();

        // Set up the stage and show it
        //primaryStage.setTitle("Candyland!!!");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
