package WinterSceneAssessmentFiles;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author justinkaufman
 */
public class StormySnowFlake extends AbstractShape{
    private SimpleSnowFlake sSnowflake;
    private FancySnowFlake fSnowflake;
         
    public StormySnowFlake(int x, int y, int w, int h, int xs, int ys) {
        super(x, y, w, h, Color.WHITE, xs, ys);
        sSnowflake = new SimpleSnowFlake(x, y, w, h);
        fSnowflake = new FancySnowFlake(x, y, w, h);
    }
    public void draw(Graphics window) {
        sSnowflake.draw(window);
        fSnowflake.draw(window);
    }

    public void moveAndDraw(Graphics window) {
        window.setColor(Color.BLUE);
        draw(window);
        sSnowflake.setXPos(getXPos() + getXSpeed());
        fSnowflake.setXPos(getXPos() + getXSpeed());
        super.setXPos(getXPos() + getXSpeed());
        sSnowflake.setYPos(getYPos() + getYSpeed());
        fSnowflake.setYPos(getYPos() + getYSpeed());
        super.setYPos(getYPos() + getYSpeed());
        window.setColor(Color.WHITE);
        draw(window);
    }
 

    
}
    
