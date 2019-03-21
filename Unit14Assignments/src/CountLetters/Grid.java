package CountLetters;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
            grid = new String[rows][cols];
            for (int i =0; i < rows; i++){
                for (int j=0; j<cols;j++){
                    grid[i][j]= vals[(int) (Math.random() * vals.length)];
                }
            }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
            String maxString = "";
            int maxCount = 0;
            for(String s : vals){
                if(maxCount<countVals(s)){
                    maxCount = countVals(s);
                    maxString = s;
                }
                else if(maxCount==countVals(s)){
                    maxString += ", " + s;
                }
            }
            return maxString;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
            int count = 0;
            for(String[] strings : grid){
                for(String s : strings){
                    if(val.equals(s)){
                        count++;
                    }
                }
            }
            return count;
	}

	//display the grid
	public String toString()
	{
            String output = "";
            for(String[] strings : grid){
                for(String s : strings){
                    output += s+" ";
                }
            output += "\n";
        }
            return output;
	}
}