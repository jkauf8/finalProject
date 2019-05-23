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
public class cactus {
    
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    
    public cactus(){
        
    }
    public cactus(int x, int y, int w, int h)
	{
            xPos=x; 
            yPos=y;
            width=w;
            height=h;
	}
    
    public void setPos(int x,int y){
        xPos=x;
        yPos=y;
    }
}
