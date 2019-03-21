package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
        List <Integer> sums = new ArrayList<>();
        for (int [] array : m){
            int sum = 0;
            for (int i :array){
                sum = sum + i;
            }
            sums.add(sum);
        }
        System.out.print("Row totals are :: ");
        return sums;
    }
}
