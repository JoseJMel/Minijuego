import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    public void move(){
        int y=getY();
        int x=getX();
        if(Greenfoot.isKeyDown("G"))y-=2;
        if(Greenfoot.isKeyDown("S"))y+=2;
        if(Greenfoot.isKeyDown("A"))x-=2;
        if(Greenfoot.isKeyDown("D"))x+=2;
        setLocation(x,y);
    }
    public void floor(){
        setLocation(getX(), getY());
        
    }
    public boolean isOnSolidGround() {
        boolean isOnGround = false;
        if(getY() > getWorld().getHeight()-50) isOnGround = true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth/ -2, imageHeight/ 2, Wall.class) !=null ||
        getOneObjectAtOffset(imageWidth/ 2, imageHeight/ 2, Wall.class) !=null) isOnGround=true;
        
        return isOnGround;
    }
}
