import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghast extends Actor
{
    /**
     * Act - do whatever the Ghast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 1;
    public void act() 
    {
      setLocation(getX()+speed, getY());
      if (isTouching(InvisWallR.class)){
            setLocation(getX()+2, getY());
            speed = speed * -1;
        }
      if (isTouching(InvisWallL.class)){
            setLocation(getX()-2, getY());
            speed = speed * -1;
        }
      if (isTouching(InvisWallU.class)){
            setLocation(getX(), getY()+2);
            speed = speed * -1;
        }
      if (isTouching(InvisWallD.class)){
            setLocation(getX(), getY()-2);
            speed = speed * -1;
        }
    }
    private void checkCollision(){
        int timer = 100; 
        if (isTouching(Hero.class)){
           timer--;
           if (timer == 0 && speed == 1){
               speed = -1;
               timer = 100;
               timer--;
               if(timer == 0){
                 speed = 1;  
                }
               
            }
        }  
    }
}    

