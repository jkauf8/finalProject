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
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class field extends Canvas implements KeyListener, Runnable
{
        private player Player1;
        private player Player2;
        private Image background;
        
	private bullets shotsR;
        private bullets shotsL;
	private int spacerl;
	private boolean[] keys;
	private BufferedImage back;
        private int player1Score;
        private int player2Score;

	

	public field()
	{
            shotsR = new bullets();
            shotsL = new bullets();
            player1Score = 0;
            player2Score=0;
            try
            {
            URL url = getClass().getResource("backgroundField.png");
            background = ImageIO.read(url);
            
            }
            catch(Exception e)
            {
            }
            
                keys = new boolean[10];

		Player1 = new player(100,240,90,90,10,10, "player1final.png");
                Player2 = new player(400,100,90,90,10,10, "player2Final.png");
                

		this.addKeyListener(this);
		new Thread(this).start();

                
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
            Graphics2D twoDGraph = (Graphics2D)window;
            
            if(back==null){
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));}
            
            Graphics graphToBack = back.createGraphics();
            
            graphToBack.drawImage(background,0,0,null);
            graphToBack.drawString("P1 Score: " + player1Score, 0, 50);
            graphToBack.drawString("P2 Score: " + player2Score, 725, 50);
            
            if(keys[0] == true)
		{
			Player1.moveLeftAndDraw(graphToBack);
                        
		}
            if(keys[1] == true)
		{
			Player1.moveRightAndDraw(graphToBack);
		}
            if(keys[2] == true)
		{
			Player1.moveUpAndDraw(graphToBack);
		}
            if(keys[3] == true)
		{
			Player1.moveDownAndDraw(graphToBack);
		}
            if(keys[4] == true)
		{
			shotsR.add(new ammo(Player1.getX()+55,Player1.getY()+40,4,4,20,0));
                        

		}
            if(keys[5] == true)
		{
			Player2.moveLeftAndDraw(graphToBack);
                        
		}
            if(keys[6] == true)
		{
			Player2.moveRightAndDraw(graphToBack);
		}
            if(keys[7] == true)
		{
			Player2.moveUpAndDraw(graphToBack);
		}
            if(keys[8] == true)
		{
			Player2.moveDownAndDraw(graphToBack);
		}
            if(keys[9] == true)
		{
                        shotsL.add(new ammo(Player2.getX(),Player2.getY()+33,4,4,20,0));

		}
            Player1.draw(graphToBack);
            Player2.draw(graphToBack);
            shotsR.drawBullets(graphToBack);
            shotsL.drawBullets(graphToBack);
            shotsR.shootBulletsRight();
            shotsL.shootBulletsLeft();
	    shotsR.rem();
            shotsL.rem();
            shotsR.bulletSpacer();
            shotsL.bulletSpacer();
            if (Player1.bulletGone(shotsL.getList())){
                player1Score++;
            };
            if(Player2.bulletGone(shotsR.getList())){
                player2Score++;
            };
            twoDGraph.drawImage(back, null, 0, 0);
	}
        public void keyPressed(KeyEvent e)
	{
            switch (toUpperCase(e.getKeyChar())) {
            case 'A':
                keys[0] = true;
                break;
            case 'D':
                keys[1] = true;
                break;
            case 'W':
                keys[2] = true;
                break;
            case 'S':
                keys[3] = true;
                break;
            case 'R':
                keys[4] = true;
                break;
            
                
            //shooting goes here
            case 'J':
                keys[5] = true;
                break;
            case 'L':
                keys[6] = true;
                break;
            case 'I':
                keys[7] = true;
                break;
            case 'K':
                keys[8] = true;
                break;
            case ' ':
                keys[9] = true;
                break;
            //shooting goes here for player2
        }
            

        }

	public void keyReleased(KeyEvent e)
	{
            switch (toUpperCase(e.getKeyChar())) {
            case 'A':
                keys[0] = false;
                break;
            case 'D':
                keys[1] = false;
                break;
            case 'W':
                keys[2] = false;
                break;
            case 'S':
                keys[3] = false;
                break;
            case 'R':
                keys[4] = false;
                break;
            //shooting goes here player1
            case 'J':
                keys[5] = false;
                break;
            case 'L':
                keys[6] = false;
                break;
            case 'I':
                keys[7] = false;
                break;
            case 'K':
                keys[8] = false;
                break;
            case ' ':
                keys[9] = false;
                break;
            //shooting goes here player1
        }

	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}



