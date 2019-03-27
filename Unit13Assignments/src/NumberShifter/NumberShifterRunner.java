package NumberShifter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner {

    public static void main(String args[]) throws IOException {
        int[] array = NumberShifter.makeLucky7Array(10);
        for(int i : array){
            System.out.print(i);
        }
        NumberShifter.shiftEm(array);
        out.println("");
        for(int i : array){
            System.out.print(i);
        }
    }
}