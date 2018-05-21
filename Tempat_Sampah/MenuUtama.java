import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuUtama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuUtama extends World
{

    /**
     * Constructor for objects of class MenuUtama.
     * 
     */
    public MenuUtama()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(880, 600, 1);
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mulai mulai = new Mulai();
        addObject(mulai,190,515);
        Bantuan bantuan = new Bantuan();
        addObject(bantuan,45,570);
        bantuan.setLocation(37,567);
    }
}
