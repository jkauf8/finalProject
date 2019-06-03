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
public class charOutline {
    private double x;
    private double y;
    private double size;
	
    public charOutline(double x, double y, double size)
    {
	this.x = x;
	this.y = y;
	this.size = size;
    }
    public boolean hitPlayer(charOutline hit)
    {
	double xD = this.getX() +this.getSize()/2 - hit.getX() - hit.getSize()/2;
	double yD = this.getY() +this.getSize()/2 - hit.getY() - hit.getSize()/2;
	double sizeD = this.getSize()/2 +hit.getSize()/2;
	return xD* xD+yD* yD <= sizeD* sizeD;
    }
    public double getX()
    {
	return x;
    }
    public double getY()
    {
	return y;
    }
    public double getSize(){
        return size;
    }
}

