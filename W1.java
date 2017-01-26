import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1 extends World
{
    Hero player;
    Ghast em1;
    Chest chest;
    int[] xCoordU;
    int[] yCoordU;
    int[] xCoordD;
    int[] yCoordD;
    //private GreenfootSound bgMusic = new GreenfootSound("Spring.mp3");
    /**
     * Constructor for objects of class W1.
     * 
     */
    public W1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(480, 387, 1);
       prepareW1();
       player = new Hero();
       chest = new Chest();
       em1 = new Ghast();
       addObject(player, getWidth()/2, getHeight()/2);
       addObject(chest, getWidth()/2+45, getHeight()/2+15);
       //changeBackground();
       showHealth();
       
    }
    
    public void act(){
        changeBackground();
        showHealth();
        endGame(); 
    }
    
    public void changeBackground()
    {
        boolean changeRoom2 = player.checkChangeWorld();
        if (changeRoom2 == true){
            addObject(em1, 30, 30);
            setBackground("W1-RM2.png"); //set image as bad plane 1
        }
    }
    public void endGame(){
		int health = player.getHealth();
		if(health == 0 || health < 0){
			System.out.println("sjdsfgbjo;dfbiodfjbifdboidfjboidjbiodfjboifdjboidjboijdfiobjfdoijbiodfjbiodnbosnfbuenuobjisoudthjbiosbiosdgbiosjdgiobnjdojbndsoifbpsdfngio[e");
			Greenfoot.stop();

		}
	}
     public void showHealth()
    {
      int health = player.getHealth();
      showText("Health:" +health, 80, 35);

        
    }
    private void prepareW1()
    {
        xCoordU = new int[] {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229};
        yCoordU = new int[] {234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234,234};
        
        for(int i = 0;i < yCoordU.length; i++){
            addObject(new InvisWallU(),xCoordU[i],yCoordU[i]);
        }
        xCoordD = new int[] {144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178};
        yCoordD = new int[] {339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339,339};
        for(int i = 0;i < yCoordD.length; i++){
            addObject(new InvisWallD(),xCoordD[i],yCoordD[i]);
        }
    /*public void started()
    {
        bgMusic.playLoop();
    }
 
    public void stopped()
    {
        bgMusic.stop();
    }
    */

   }
}
