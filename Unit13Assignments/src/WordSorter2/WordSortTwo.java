package WordSorter2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {

    private String[] wordRay;

    public WordSortTwo(String sentence) {
        wordRay = sentence.split(" ");
    }
    public void sort() {
        int minIn;
        String minVal;
        for (int i = 0; i < wordRay.length; i++) {
            minIn = i;
            minVal = wordRay[i];
            for (int j = i; j < wordRay.length; j++) {
                if (wordRay[j].compareTo(minVal) < 0) {
                    minVal = wordRay[j];
                    minIn = j;
                }
            }
            String temp = wordRay[i];
            wordRay[i] = wordRay[minIn];
            wordRay[minIn] = temp;
        }
    }

    public String toString() {
        String output = "";
        for(String s: wordRay){
            output += s + " \n";
        }
        return output + "\n\n";
    }
}