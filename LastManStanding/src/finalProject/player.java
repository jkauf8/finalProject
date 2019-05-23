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
public class player {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private int xSpeed;
    private int ySpeed;
    private int score;
    public player(){
        
    }
    public player(int x, int y, int w, int h,  int xSpd, int ySpd, int s){
        xPos =x;
        yPos=y;
        width =w;
        height =h;
        xSpeed =xSpd;
        ySpeed=ySpd;
        score =s;
    }
    
}
