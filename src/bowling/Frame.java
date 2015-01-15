/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author 
 */
public class Frame {
    public final int BALL1;
    public final int BALL2;
    
    Frame(int ball1,int ball2)
    {
        BALL1=ball1;
        BALL2=ball2;
    }
    
    /**
     * Indicates if the bowler scored a strike in this frame
     * @return true if its a strike, false if not
     */
    public boolean isStrike()
    {
        return BALL1 == 10;
    }
    
    /**
     * Indicates if the bowler scored a spare in this frame
     * @return true if its a spare, false if not
     */
    public boolean isSpare()
    {
        // checks if BALL1 has a score of less than 10 AND
        // BALL1+BALL2==10.  If both conditions are true this
        // method is true.
        return (BALL1 < 10 && (BALL1+BALL2 == 10));
    }
}
