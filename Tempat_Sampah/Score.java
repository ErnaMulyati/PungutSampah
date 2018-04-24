import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static final float FONT_SIZE = 48;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    /**
     * Create a score with dummy result for testing.
     */
    public Score()
    {
        this(100);
    }
    
    /**
     * Create a score for the final result.
     */
    public Score(int score)
    {
        makeImage("Game Over", "Score Anda Adalah:", score);
    }
    
    /**
     * Make the score image
     */
    private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0 , 0 , 0 , 160));
        image.fillRect(0 ,0 , WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    } 
}
