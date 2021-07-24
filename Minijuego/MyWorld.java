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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,30,470);
        Wall wall = new Wall(600,50);
        addObject(wall,400,475);
        Wall wall2 = new Wall(50,400);
        addObject(wall2,125,200);
        Wall wall3 = new Wall(50,350);
        addObject(wall3,675,275);
        Wall wall4 = new Wall();
        addObject(wall4,225,425);
        Wall wall5 = new Wall(500,50);
        addObject(wall5,400,25);
        Wall wall6 = new Wall();
        addObject(wall6,675,25);
        Wall wall7 = new Wall();
        addObject(wall7,225,375);
        Wall wall8 = new Wall();
        addObject(wall8,275,375);
    }
}
