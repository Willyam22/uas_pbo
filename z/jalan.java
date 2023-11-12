import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class jalan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalan extends Actor
{
    /**
     * Act - do whatever the jalan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void movedown(int jarak){
        setLocation(getX(), getY() + jarak);
    }
    
    public void balik(){
        if(getY() == getWorld().getHeight() - 1){
            setLocation(getX(),0);
            if(MyWorld.vs == false){
                MyWorld.miss += 1;
            }
            
        }
    }
    public void perfect(){
        ArrayList<Integer> rp = new ArrayList<Integer>();
        for (int i = 540 ; i < 570; i++){
            rp.add(i);
        }
        
        if (rp.contains(getY()) && Greenfoot.isKeyDown("down")){
            getWorld().removeObject(this);
            MyWorld.counterHit.add(1);
        }
    }
    
    public void perfectats(){
        ArrayList<Integer> rp = new ArrayList<Integer>();
        for (int i = 540 ; i < 570; i++){
            rp.add(i);
        }
        
        if (rp.contains(getY()) && Greenfoot.isKeyDown("up")){
            getWorld().removeObject(this);
            MyWorld.counterHit.add(1);
        }
    }
    
    public void perfectkn(){
        ArrayList<Integer> rp = new ArrayList<Integer>();
        for (int i = 560 ; i < 580; i++){
            rp.add(i);
        }
        
        if (rp.contains(getY()) && Greenfoot.isKeyDown("right")){
            getWorld().removeObject(this);
            MyWorld.counterHit.add(1);
        }
    }
    
    public void perfectkr(){
        ArrayList<Integer> rp = new ArrayList<Integer>();
        for (int i = 560 ; i < 580; i++){
            rp.add(i);
        }
        
        if (rp.contains(getY()) && Greenfoot.isKeyDown("left")){
            getWorld().removeObject(this);
            MyWorld.counterHit.add(1);
        }
    }
    
    public void visible(){
        if (MyWorld.vs == true){
            getImage().setTransparency(0);        
        }
    }
    
    
}
