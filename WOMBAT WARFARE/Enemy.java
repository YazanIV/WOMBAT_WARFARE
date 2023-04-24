import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer=0;
    int dir=0;
    public void act()
    {
        move();
    }
    public void move()
    {
        timer++;
        
        if (dir==0)
        {
            if (timer%2==0)
            { setLocation(getX()+1,getY()); }
        }
        else
        {
            if (timer%2==0)
            { setLocation(getX()-1,getY()); }
        }
    }
}
