/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

/**
 *
 * @author justinkaufman
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class ammo extends movingObject
{
	private int yspeed;
        private int xspeed;
        private double speed;

	public ammo()
	{
		this(0,0,0,0);
	}

	public ammo(int x, int y, int w, int h)
	{
            super(x,y,w,h);
	}


	public ammo(int x, int y, int w, int h, int xs, int ys)
	{
            super(x,y,w,h,xs,ys);
            xspeed = xs;
            yspeed = ys;
	}

	public void setSpeed(int xs, int ys)
	{
            xspeed = xs;
            yspeed = ys;
	}

        public int getYSpeed()
        {
            return yspeed;
        }
        
         public int getXSpeed()
        {
            return xspeed;
        }
         
	public double getSpeed()
	{
           speed = Math.sqrt(Math.pow(yspeed, 2)+Math.pow(xspeed, 2));
	   return speed;
	}

	public void draw( Graphics window )
	{
            window.setColor(Color.BLUE);
            window.fillRect(getX(), getY(), 8, 8);
	}
	
	
	public void move( String direction )
	{
            if(direction.equals("LEFT")){
               setX(getX()-getXSpeed());
            }
            if(direction.equals("RIGHT")){
               setX(getX()+getXSpeed());
            }
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
