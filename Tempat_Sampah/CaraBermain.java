import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaraBermain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaraBermain extends World
{

    /**
     * Constructor for objects of class CaraBermain.
     * 
     */
    public CaraBermain()
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
        Kembali kembali = new Kembali();
        addObject(kembali,800,556);
        kembali.setLocation(785,551);
    }
}
