/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Alexa Horvath, Julia Calderone, Claire Engel, Viveka Kurup
 * Section: 01
 * Date: 11/9/22
 * Time: 6:46 PM
 *
 * Project: csci205_final_project
 * Package: org.candy
 * Class: Spaces
 *
 * Description:
 * Represents a space on the game board
 * ****************************************
 */
package org.candy;


/**
 * class representing a space on the gameboard
 */
public class Space {

    /** color of the space */
    private Colors color;

    /**type of space*/
    private spaceType sType;

    /**
     * creates a space object with a given color and type
     * @param color
     * @param sType
     */
    public Space(Colors color, spaceType sType) {
        this.color = color;
        this.sType = sType;
    }

    /**
     * changes the type of space to the given type
     * @param newType
     */
    public void setSpaceType(spaceType newType){
        this.sType = newType;
    }

    /**
     * changes the color of the space to the given color
     * @param newColor
     */
    public void setSpaceColor(Colors newColor){
        this.color = newColor;
    }

    /**
     * @return type of space
     */
    public spaceType getType() {
        return this.sType;
    }

    /**
     * @return true if space is licorice
     */
    public boolean isLicorice(){
        if (sType == spaceType.LICORICE){
            return true;
        }
        return false;
    }

    /**
     * @return true if space is a bridge
     */
    public boolean isBridge() {
        if (this.sType == spaceType.BRIDGE) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return space color
     */
    public Colors getColor(){
        return this.color;
    }

}
