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
import javax.swing.JFrame;
import java.awt.Component;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class game extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public game()
	{
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main( String args[] )
	{
		game run = new game();
	}
}
