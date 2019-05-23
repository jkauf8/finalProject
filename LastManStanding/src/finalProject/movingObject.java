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
public class movingObject {
    int xPos, yPos, width, height, xSpd, ySpd;
    
    public movingObject(int x, int y, int w, int h){
    
    }
    public movingObject(int x, int y, int w, int h, int xs, int ys){
        xPos =x;
        yPos=y;
        width=w;
        height=h;
        xSpd=xs;
        ySpd=ys;
    }
    public void setPos( int x, int y)
	{
            xPos = x;
            yPos = y;
	}

    public void setX(int x)
	{
            xPos = x;
	}

    public void setY(int y)
	{
            yPos = y;
	}

    public int getX()
	{
            return xPos;
	}

    public int getY()
	{
            return yPos;
	}

    public void setWidth(int w)
	{
            width = w;
	}

    public void setHeight(int h)
	{
            height = h;
	}

    public int getWidth()
	{
            return width;
	}

    public int getHeight()
	{
            return height;
	}
    public void setxSpd(int xs)
        {
            xSpd=xs;
        }
    public void setySpd(int ys)
        {
            ySpd=ys;
        }
    public int getxSpd()
        {
            return xSpd;
        }
    public int getySpd()
        {
            return ySpd;
        }
}
