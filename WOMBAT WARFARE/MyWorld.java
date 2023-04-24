import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class myWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1 pixel.
        super(800, 600, 1); 
        
        //add player
        addObject(new Player(), 300, 100);
        
        //platform 1
        addObject(new Object(), 300, 200);
        addObject(new Object(), 362, 200);
        addObject(new Object(), 424, 200);
        addObject(new Object(), 486, 200);
        
        //platform 2
        addObject(new Object(), 400, 350);
        addObject(new Object(), 462, 350);
        addObject(new Object(), 524, 350);
        addObject(new Object(), 586, 350);

        //platform 3
        addObject(new Object(), 100, 500);
        addObject(new Object(), 162, 500);
        addObject(new Object(), 224, 500);
        addObject(new Object(), 286, 500);

        //floor
        addObject(new Object(), 28, 600);
        addObject(new Object(), 90, 600);
        addObject(new Object(), 152, 600);
        addObject(new Object(), 214, 600);
        addObject(new Object(), 276, 600);
        addObject(new Object(), 338, 600);
        addObject(new Object(), 400, 600);
        addObject(new Object(), 462, 600);
        addObject(new Object(), 524, 600);
        addObject(new Object(), 586, 600);
        addObject(new Object(), 648, 600);
        addObject(new Object(), 710, 600);
        addObject(new Object(), 772, 600);       
     }
}