import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{

    /**
     * Constructor for objects of class play.
     * 
     */
    str play = new str();
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 650, 1);
        GreenfootImage image = play.getImage();
        image.scale(150,150);
        addObject(play, 400/2, (650/2) + 130 );
    }
}
