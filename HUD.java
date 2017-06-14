/*HUD.java
 * Author: Andrew Lee
 * Date: June 13, 2017
 * To create and display object for the HUD
 */

import java.awt.*;
import java.io.*; 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


class HUD { 
  
  BufferedImage healthImg1=null, healthImg2=null,healthImg3=null,healthImg4=null,ammoImg=null, armorImg=null;
  
    /**
   * HUD
   * This is a contructor for the HUD object
   * @param nothing as it is used to load images
   * @return Nothing because it is a constructor
   */
  public HUD() { 
    //load images
    try {
      healthImg1 = ImageIO.read(new File("health1.png"));
      healthImg2 = ImageIO.read(new File("health2.png"));
      healthImg3 = ImageIO.read(new File("health3.png"));
      healthImg4 = ImageIO.read(new File("health3.png"));
      ammoImg = ImageIO.read(new File("ammo.png"));
      armorImg = ImageIO.read(new File("armor.png"));
      
    } catch(Exception E) { 
      System.out.println("error loading picture!");
    }
  }
  
   /**
   * drawheart
   * This draws the heart graphic of the HUD 
   * @param Graphics object, x and y for location, health value for different graphics
   * @return Nothing because it is drawing the object
   */
  
  public void drawheart(Graphics g, int x, int y, double health) { 
    if (health==100){
    g.drawImage(healthImg1,x,y,null);
    }else if(health<100 && health>74){
      g.drawImage(healthImg2,x,y,null);
    }else if (health<75 && health>49){
      g.drawImage(healthImg3,x,y,null);
    }else if (health<50 && health >24){
      g.drawImage(healthImg4,x,y,null);
    }else if (health<25 && health!=0){
      g.drawImage(healthImg4,x,y,null);
    }
  }
  
     /**
   * drawammo
   * This ammo the heart graphic of the HUD 
   * @param Graphics object, x and y for location
   * @return Nothing because it is drawing the object
   */
    public void drawammo(Graphics g, int x, int y) { 
    
    g.drawImage(ammoImg,x,y,null);

    
  }
    
    
  
  
    

  
     /**
   * draw
   * This draws the text displaying the values of the HUD ie. health, ammo
   * @param Graphics object, x and y for location, amount to display the actual value, valuename to label
   * @return Nothing because it is drawing the object
   */
  
  public void draw(Graphics g,int x, int y, double amount, String valueName) { 
    
     g.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 18));
    g.drawString(valueName+": "+amount,x,y);
    
  }
  
}
  
  
