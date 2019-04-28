package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
        private int tick;


	public AlienHorde(int size)
	{
            aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for (int i =0; i<aliens.size(); i++){
                aliens.get(i).draw(window);
            }
	}

	public void moveEmAll()
	{
            tick++;
            for (Alien alien : aliens) {
                if (tick <= 200) {
                    alien.move("LEFT");
                } 
                else if (tick <= 300) {
                    alien.move("DOWN");
                } 
                else if (tick <= 500) {
                    alien.move("RIGHT");
                } 
                else if (tick <= 600) {
                    alien.move("UP");
                } 
                else {
                    tick = 0;
                }
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
            for (int i = 0; i < shots.size(); i++) {
		for (int j = 0; j < aliens.size(); j++) {
                    try {
			if (shots.get(i).isCollide(aliens.get(j))) {
                            shots.remove(i);
                            aliens.remove(j);
                            i--;
                            j--;
			}
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
		}

            }
	}
        
        public boolean checkCollide(MovingThing t)
	{
            for(Alien a:aliens){
		if(a.isCollide(t))
		{
                    return true;
		}
            }
            return false;
	}

	public String toString()
	{
		return "";
	}
}
