package CountLetters;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
            String[] array = {"1","3","5","a","b","c"};
            Grid grid = new Grid(5, 10, array);
        
            System.out.println(grid.toString());
            System.out.println(grid.findMax(array) + " occurs the most");

	}
}