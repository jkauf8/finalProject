package finalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author justinkaufman
 */
public class bullets {
        private List<ammo> ammo;
	private boolean bulletCheck = true;
        private int spacerl = 20;
        private int spacer;
        
        
        public bullets()
	{
            ammo = new ArrayList<ammo>();
	}

	public void add(ammo al)
	{
            if (bulletCheck){
		ammo.add(al);
		bulletCheck = false;
            } 
            
	}

	public void drawBullets( Graphics window )
	{
            for (int i =0; i<ammo.size(); i++){
                ammo.get(i).draw(window);
            }
	}

	public void shootBulletsRight()
	{
            for (int i = 0; i < ammo.size(); i++) {
		ammo.get(i).move("RIGHT");
            }
            
	}
        public void shootBulletsLeft()
	{
            for (int i = 0; i < ammo.size(); i++) {
		ammo.get(i).move("LEFT");
            }
            
	}

	public void rem()
	{
            for (int i = 0; i < ammo.size(); i++) {
		if (ammo.get(i).getY() < 0) {
                    ammo.remove(i);
                    i--;
		}
            }
	}
        public void spacerl(int i )
	{
		spacerl= i;
	}

	public List<ammo> getList()
	{
		return ammo;
	}
        public void bulletSpacer() {
		spacer++;
		if (spacer >= spacerl) {
			bulletCheck = true;
			spacer = 0;
		}
	}

	public String toString()
	{
		return Arrays.toString(ammo.toArray());
	}
}
