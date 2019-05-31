/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author justinkaufman
 */
public class player extends movingObject{
    private Image image;
    
    public player(){
        this(10,10,10,10,10,10);
    }
    
    public player(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    
    public player(int x, int y, int w, int h, int xSpd, int ySpd){
        super(x,y,w,h,xSpd,ySpd); 
        
        try
        {
            URL url = getClass().getResource("player1final.png");
            image = ImageIO.read(url);
	}
	catch(Exception e)
	{
     	}
    }
    
    public player(int x, int y, int w, int h, int xSpd, int ySpd, String name){
        super(x,y,w,h,xSpd,ySpd); 
        
        try
        {
            URL url = getClass().getResource(name);
            image = ImageIO.read(url);
	}
	catch(Exception e)
	{
     	}
    }
    
    
    public void moveUpAndDraw(Graphics window) {
        draw(window);

        setY(getY() -getySpd());

        draw(window);
    }

    public void moveDownAndDraw(Graphics window) {
        draw(window);

        setY(getY() +getySpd());


        draw(window);
    }
    public void moveLeftAndDraw(Graphics window) {
        draw(window);

        setX(getX() -getxSpd());


        draw(window);
    }  
    public void moveRightAndDraw(Graphics window) {
        draw(window);

        setX(getX()+getxSpd());


        draw(window);
    }
   public boolean bulletGone(List<ammo> bullets)
	{
             for (int i = 0; i < bullets.size(); i++)
                 try{
                    if (bullets.get(i).isHit(this)) {
                            bullets.remove(i);
                            i--;
                            return true;
                        
			}
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
             return false;
		}

	
    public boolean checkHit(movingObject hit)
	{
            if(this.isHit(hit))
            {
                return true;
            }
            return false;
	}
    public void draw( Graphics window )
    {
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(), null);
    }

    public String toString()
    {
	return super.toString() ;
    }
}
