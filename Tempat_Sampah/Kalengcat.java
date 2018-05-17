import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kalengcat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalengcat extends Sampah
{
    /**
     * Act - do whatever the Kalengcat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX() >=0){
            setLocation(getX()+1, getY());
        }
        
        if(getX() >= 999){
            getWorld().addObject(new Cangkir(),0, 197);
            getWorld().removeObject(this);
            return;
        }
        
        if(Greenfoot.mouseDragged(this)) //follow the mouse
        {
            MouseInfo mi = Greenfoot.getMouseInfo();//gets mouse information
            setLocation(mi.getX(), mi.getY()); //gets location of piece at location of mouse
            return;
        }
        
        if(Greenfoot.mouseDragEnded(this)){
            if(getOneIntersectingObject(Kaleng.class) !=null){
                ((Bersih) getWorld()).countPop();
                getWorld().addObject(new Kalengsarden(),0, 197);
                getWorld().removeObject(this);
            }
            else if(getOneIntersectingObject(SampahKertas.class) !=null){
                ((Bersih) getWorld()).mincountPop();
                getWorld().addObject(new Kalengsarden(),0, 197);
                getWorld().removeObject(this);
            }
            else if(getOneIntersectingObject(Kaca.class) !=null){
                ((Bersih) getWorld()).mincountPop();
                getWorld().addObject(new Kalengsarden(),0, 197);
                getWorld().removeObject(this);
            }
            else if(getOneIntersectingObject(Organik.class) !=null){
                ((Bersih) getWorld()).mincountPop();
                getWorld().addObject(new Kalengsarden(),0, 197);
                getWorld().removeObject(this);
            }
    }
    }
}    
