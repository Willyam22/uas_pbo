import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Counter counterHit;
    kanan knan = new kanan();
    bawah bwh = new bawah();
    kiri kri = new kiri();
    jalan jl = new jalan();
    public static Counter counterlvl;
    private int llvl = 1;
    public static int miss = 0;
    public static boolean vs = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 650, 1); 
        prepare();
        
        System.out.println("coba");
        
        counterlvl = new Counter("level: ");
        addObject(counterlvl, 50,20);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        hit hit = new hit();
        addObject(hit,265,550);
        garis garis = new garis();
        addObject(garis,195,600);
        hit2 hit2 = new hit2();
        addObject(hit2,340,550);
        hit3 hit3 = new hit3();
        addObject(hit3,170,570);
        hit1 hit1 = new hit1();
        addObject(hit1,60,570);
        
        garis.setLocation(57,622);
        counterHit = new Counter("hit: ");
        addObject(counterHit,57,622);
        
    }
    
    
    private SimpleTimer coba = new SimpleTimer();
    private int lvl = 4;
    private int odd = 300;
    public void act(){
        int ms = Greenfoot.getRandomNumber(odd);
        int a = Greenfoot.getRandomNumber(odd);
        int b = Greenfoot.getRandomNumber(odd);
        int c = Greenfoot.getRandomNumber(odd);
        int d = Greenfoot.getRandomNumber(odd);
        atas ats = new atas();
        
        int tbw = getObjects(bawah.class).size();
        int tats = getObjects(atas.class).size();
        int tkri = getObjects(kiri.class).size();
        int tkn = getObjects(kanan.class).size();
        int tob = tbw+tats+tkri+tkn;
        
        if(tob < lvl){
            if (a == ms ){
            for (int i = 0; i < 1; i++){
            addObject(kri, 60, 0);
            }
            a = Greenfoot.getRandomNumber(odd);
            }
            else if (a != ms){
                a = Greenfoot.getRandomNumber(odd);
            }
        
            if (b == ms ){
                for (int i = 0; i < 1; i++){
                addObject(bwh, 265, 0);
                }
                b = Greenfoot.getRandomNumber(odd);
            }
            else if (b != ms){
                 b = Greenfoot.getRandomNumber(odd);
            }
        
            if (c == ms ){
                for (int i = 0; i < 1; i++){
                addObject(knan, 170, 0);
                }
                c = Greenfoot.getRandomNumber(odd);
            }
            else if (c != ms ){
                 c = Greenfoot.getRandomNumber(odd);
            }
            
            if (d == ms ){
                for (int i = 0; i < 1 ; i++){
                addObject(ats, 340, 0);
                }
                d = Greenfoot.getRandomNumber(odd);
            }
            else if (d != ms){
                 d = Greenfoot.getRandomNumber(odd);
            }
        }
        
        if(coba.millisElapsed() > 65000){
            Counter countermiss = new Counter("miss: ");
            countermiss.setValue(miss);
            addObject(countermiss, 400/2, (620/2) + 50);
            counterHit.setLocation(400/2,(620/2) - 50);
            vs = true;
            Greenfoot.stop();
        }
        
        if(coba.millisElapsed() >= 25000 && coba.millisElapsed() <= 40000){
            lvl = 7;
            odd = 200;
            llvl = 2;
        }
        else if (coba.millisElapsed() > 40000){
            lvl = 9;
            odd = 100;
            llvl = 3;
        }
        counterlvl.setValue(llvl);
         
        
        
        
        
        
        
        
    
        
        
    }
        
    
    
    
}
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
