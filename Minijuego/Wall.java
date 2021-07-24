import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wall(){
        this(50,50);
    }
    public Wall(int width, int height){
        GreenfootImage image=getImage();
        image.scale(width,height);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
    
    }
