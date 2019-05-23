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
        private int tickSpacer = 65;
        private int tick;
        
        
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

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
            for (int i =0; i<ammo.size(); i++){
                ammo.get(i).draw(window);
            }
	}

	public void moveEmAll()
	{
            for (int i = 0; i < ammo.size(); i++) {
		ammo.get(i).move("UP");
            }
            
	}

	public void cleanEmUp()
	{
            for (int i = 0; i < ammo.size(); i++) {
		if (ammo.get(i).getY() < 0) {
                    ammo.remove(i);
                    i--;
		}
            }
	}
        public void setTickSpacer(int i )
	{
		tickSpacer= i;
	}

	public List<ammo> getList()
	{
		return ammo;
	}
        public void bulletSpacer() {
		tick++;
		if (tick >= tickSpacer) {
			bulletCheck = true;
			tick = 0;
		}
	}

	public String toString()
	{
		return Arrays.toString(ammo.toArray());
	}
}
