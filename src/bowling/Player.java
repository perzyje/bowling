/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;
import java.util.ArrayList; 
/**
 *
 * @author 
 */
public class Player {
    //===============Variables  
    private final String NAME; 
    private final int TOTAL_PINS = 10; //number of pin in a frame
    private ArrayList<Frame> game = new ArrayList<Frame>(); //Array of frame objects
    private int frameCount = 0; 
    private int strikeCount = 0; 
    private int spareCount = 0; 
    private int totalScore = 0; 
    
    
//================Constructor 
    
    public Player (String name)
    {
        this.NAME = name; 
    }//eoconstructor String 
    
//================Mutators 
    
    public void addFrame(int ballOne, int ballTwo )
    {
        //Check that the total number of pins recorded are 
        //equal to or less than the total number of pins 
        //per frame
        if (ballOne + ballTwo <= TOTAL_PINS)
        {
            //add a valid frame to the game array
            Frame currentFrame = new Frame(ballOne, ballTwo); 
            game.add(currentFrame); 
            frameCount++; //increment the frame count 
        }
    
    }//eomethod addFrame
    
    
    
}//EOCLASS Player

