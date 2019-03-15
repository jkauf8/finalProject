package Monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner kb = new Scanner(System.in);
		
                
		//ask for name and size
                System.out.print("Enter 1st monster's name: ");
                String name1 = kb.nextLine();
                System.out.print("Enter 1st monster's size: ");
                int size1 = kb.nextInt();
                kb.nextLine();
		
		//instantiate monster one
                Skeleton m1 = new Skeleton(name1, size1);
		
		//ask for name and size
                System.out.print("Enter 2nd monster's name: ");
                String name2 = kb.nextLine();
                System.out.print("Enter 2nd monster's size: ");
                int size2 = kb.nextInt();
                kb.nextLine();
		
		//instantiate monster two
                Skeleton m2 = new Skeleton(name2, size2);
                
                if(m1.isBigger(m2)){
                    System.out.println("Monster one is bigger than Monster two.");
                }
                else if(m1.isSmaller(m2)){
                    System.out.println("Monster one is smaller than Monster two.");
                }
                else{
                    System.out.println("Monster one is the same size as Monster two");
                }
                
                if(m1.namesTheSame(m2)){
                    System.out.println("Monster one has the same name as Monster two");
                }
                else{
                    System.out.println("Monster one doesn't have the same name as Monster two");
                }
                
	}
}