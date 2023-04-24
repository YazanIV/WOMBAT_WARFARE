import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Enemy
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage right = new GreenfootImage("wombat1.png");
    GreenfootImage left = new GreenfootImage("wombat2.png");
    public void act()
    {
        move();
        
        if (dir==0)
        { setImage(right); }
        if (dir==180)
        { setImage(left); }
    }
}
