import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MelleEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MelleEnemy extends Actor
{
    /**
     * Act - do whatever the MelleEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
	private int timer = 1;
    public void act() 
    {
        checkCollision();
		movement();
        int speed = 1;
		
		setLocation(getX()+speed, getY());
        
    } 	
	public int movement(){	
		boolean chngDir = false;
		if (isTouching(Hero.class)){
            timer--;
            if (timer == 0){
                speed = -65;
				System.out.println(speed);
				chngDir = true;
            }
			if(chngDir = true){
				setLocation(getX()+speed, getY());
				//System.out.println(timer);
				if(timer == -25){
        			speed = 1;
					//setLocation(getX()+speed, getY());  
            		
            }
            }
        }
		//setLocation(getX()+speed, getY());
		//checkCollision();
		return(speed);
	}
    public int checkCollision(){
		int speed = 1; 
        	
        	
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
		return (speed);
        }    
}
