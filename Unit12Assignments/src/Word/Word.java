//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Word;
import static java.lang.System.*;

public class Word implements Comparable<Word> {

    private String word;

    public Word(String s) {
        word = s;
    }

    public int compareTo(Word rhs) {
        int compare;
        if(word.length()-rhs.toString().length()==0){
            compare = word.compareTo(rhs.toString());
        }
        else{
            compare = word.length()-rhs.toString().length();
        }
        return compare;
    }

    public String toString() {
        return word;
    }
}