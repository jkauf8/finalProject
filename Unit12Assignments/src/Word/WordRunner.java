//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Word;
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("src/Word/words.dat"));
        int size = file.nextInt();
        
        Word[] array = new Word[size];
        for(int i = 0; i < size; i++){
            array[i] = new Word(file.nextLine());
        }
        
        Arrays.sort(array);
        
        for(Word w: array)
            System.out.println(w.toString());
	}
}