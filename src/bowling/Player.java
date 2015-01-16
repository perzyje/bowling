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
    private final int STANDARD_GAME = 10; //number of frames in a standard game 
//    private final int MAX_FRAMES = 11; //maximum frames in a game
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
        
        if (ballOne + ballTwo <= TOTAL_PINS && game.size() <= STANDARD_GAME)
        {
            //add a valid frame to the game array
            Frame currentFrame = new Frame(ballOne, ballTwo); 
            frameCount++; //increment the frame count 
            
            /*DESIGN NOTE :G.KOEHL 
             * Using the array size to indicate the 10th frame instead of
             * using the element index to make more natural to the game 
            */
            
            //First condition will add properly formated frames to the game array
            //during the course of a standard game. 10 frames of bowling
            if (game.size() <= STANDARD_GAME)//frames 1-10
                {
                    game.add(currentFrame); 
                    
                }
            //independant checking for the 10th frame only 
            if (game.size() == STANDARD_GAME )
            {
                if (currentFrame.isSpare())
                
                {
                    System.out.println("You get to bowl one more ball");
                    //conditions for a spare in the last frame of Standard Game
                    //prompt the user for one more value for pins
                    //add a new additional frame to the game with 
                    //user value and 0 for the second value 
                    
                }
                else if (currentFrame.isStrike())
                {
                    System.out.println("You get to bowl two more balls "); 
                    //conditions for a strike in the last frame Standard Game 
                    //prompt the user for two more values for pins 
                    //add the user values to the game array 
                }
                //end of the game 
                else  
                {
                    System.out.println("Good Game!");
                }
            }
            
            //catch any attempt to add addition frames beyond STANDARD_GAME 
            
            else  
            {
                System.out.println("Game Over, no more frames can be added.");
            }
        }
        //catch invalid input 
        else 
        {
            System.out.println("A problem occurred. Frame could not be added"); 
        }
    
    }//eomethod addFrame
    
    
    
}//EOCLASS Player

