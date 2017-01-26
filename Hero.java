import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public boolean W1RM2 = false;
    private int health = 15;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    public Hero(){
        image1 = new GreenfootImage("Hero!!.png");
        image2 = new GreenfootImage("Hero!! back Left.png");
        image3 = new GreenfootImage("Hero!! back Right.png");
        image4 = new GreenfootImage("Hero Right Closed Legs.png");
        image5 = new GreenfootImage("Hero Right Open Legs.png");
        image6 = new GreenfootImage("Hero Left Closed Legs clone.png");
        
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your amction code here.
        // in act method, use:
        checkKeyPress();
        
        //walkingAnimation();// to move maximum of 4 pixels
        // where move(int) is defined as
        
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-2);
            setImage(image2);
            setImage(image3);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+2);
            setImage(image1);
            
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+2, getY());
            setImage(image4);
            setImage(image5);
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-2, getY());
            setImage(image6);
            
        }
         if(Greenfoot.isKeyDown("w")){
          setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("s")){
          setLocation(getX(), getY()+2);
        }
        if(Greenfoot.isKeyDown("a")){
          setLocation(getX()-2, getY());
        } 
        if(Greenfoot.isKeyDown("d")){
          setLocation(getX()+2, getY());
        } 
        if (isTouching(InvisWallR.class)){
            setLocation(getX()+2, getY());
        }
        if (isTouching(InvisWallL.class)){
            setLocation(getX()-2, getY());
        }
        if (isTouching(InvisWallU.class)){
            setLocation(getX(), getY()+2);
        }
        if (isTouching(InvisWallD.class)){
            setLocation(getX(), getY()-2);
        }
    }
  public void switchImageUp()
    {
        if (getImage() == image2) 
        {
            setImage(image3);
        }
        else
        {
            setImage(image2);
        }
    }
   public void switchImageRight()
    {
        if (getImage() == image4) 
        {
            setImage(image5);
        }
        else
        {
            setImage(image4);
        }
    }
    
    public boolean checkChangeWorld()
    {
       boolean W1RM2 = false;
       if (isTouching(Chest.class)) 
       {
            W1RM2 = true;
       }
       return W1RM2;
    }
    private void checkCollision(){
        if (isTouching(Ghast.class)){
            health = health-3;
        }  
    }
    public int getHealth()
    {
        return health;
    }
}

