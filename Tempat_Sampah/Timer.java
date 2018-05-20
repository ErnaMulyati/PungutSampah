import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int time = 50;
    private int count = 50;
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(time == 0)
        {
            ((Bersih)getWorld()).gameOver();
            Greenfoot.stop();
        }
        if(counter())
        {
            time--;
            count = 45;
        }
        display();
    }  
    
    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }
    
    private void display()
    {
        setImage(new GreenfootImage("Time: "+ time +" sec", 30, Color.BLACK, new Color(0, 0, 0, 0)));
    }
   
    public boolean isTimeUp()
    {
        return time == 0;
    }
}
