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
public class Bowling 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        BowlingDemo(); //run the bowling demo 
        
        
    }//eoMain
    
    
    /** 
     * Static Method to work on the self-test and test functionality of the 
     * BowlingGame project.
     * This will populate a full game of bowling that can be used to further 
     * test scoring and other implementations  
     */
    private static void BowlingDemo()
    {
    
        Player me = new Player("DemoPlayer"); 
        
        
        System.out.println("Current Round Over? " +  me.shot(1)); 
        System.out.println("Current Round Over? " +  me.shot(0)); 
        System.out.println("Current Round Over? " +  me.shot(3)); 
        System.out.println("Current Round Over? " +  me.shot(7)); 
         System.out.println("Current Round Over? " +  me.shot(1)); 
        System.out.println("Current Round Over? " +  me.shot(4)); 
        System.out.println("Current Round Over? " +  me.shot(0)); 
        System.out.println("Current Round Over? " +  me.shot(9)); 
         System.out.println("Current Round Over? " +  me.shot(1)); 
        System.out.println("Current Round Over? " +  me.shot(6)); 
        System.out.println("Current Round Over? " +  me.shot(0)); 
        System.out.println("Current Round Over? " +  me.shot(9)); 
         System.out.println("Current Round Over? " +  me.shot(2)); 
        System.out.println("Current Round Over? " +  me.shot(4)); 
        System.out.println("Current Round Over? " +  me.shot(10)); 
        System.out.println("Current Round Over? " +  me.shot(0)); 
         System.out.println("Current Round Over? " +  me.shot(1)); 
        System.out.println("Current Round Over? " +  me.shot(3)); 
        System.out.println("Current Round Over? " +  me.shot(0)); 
        System.out.println("Current Round Over? " +  me.shot(9)); 
        me.shot(1);
        me.seeGame();
    
    
    
    }//eomethod BowlingDemo
    
}//EOCLASS Bowling 
