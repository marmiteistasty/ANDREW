/* KeyCard.java
 * Author: Hady Mana
 * Date: June 14,2017
 * Used to advance to the next level
 */

import java.awt.Graphics;
import java.awt.*;
import java.io.*; 
import java.awt.image.*;
import javax.imageio.*;
import java.awt.geom.AffineTransform;

class KeyCard extends Entity{
  BufferedImage card;
  
  public KeyCard(int x, int y){
    super(x,y, (new Rectangle( (int)x, (int)y, 35, 35)));
      loadSprites();  
  }
  public void loadSprites() { 
       try {    
     card = ImageIO.read(new File("keycard.png"));   
     } catch(Exception e) { System.out.println("error loading sprite");};
  
  }
  public void draw(Graphics g) { 
     Graphics2D g2d=(Graphics2D)g;
     AffineTransform rotateCard=new AffineTransform();
     rotateCard.translate(this.getX(),this.getY());
     g2d.drawImage(card,rotateCard,null);
   }
}
  