import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import java.awt.Graphics;
import greenfoot.Font;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;/*private static final Color TEXT_COLOR = new Color;
    private static final Color TRANSPARENT_COLOR = new Color(0, 0, 0, 0);
    private Kaleng kaleng; */
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter() 
    {
       this("Score: ");
    } 
    
    public Counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() +2) * 16;
        
        setImage(new GreenfootImage(stringLength, 30));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(18)); //use large font
        image.setColor(Color.BLACK);
        updateImage();
    }
    
    public void act() {
        if(value<target){
            value++;
            updateImage();
        }
        else if(value>target){
            value--;
            updateImage();
        }
    }
    
    public void add(int score)
    {
        target += score;
    }
    
    public void subtract(int score)
    {
        target -= score;
    }
    
    public int getValue()
    {
        return value;
    }
    
    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
