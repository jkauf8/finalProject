package Recursions;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
            int count =0;
            if (num>0){
                if (num%2==0){
                    count=1;
                }
             count+=countEvenDigits(num/10);
            }


            return count;
	}
}