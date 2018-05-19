import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bantuan extends Actor
{
    /**
     * Act - do whatever the Bantuan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new CaraBermain());
        }
    }    
}
