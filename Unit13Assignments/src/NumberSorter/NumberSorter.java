//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
    //instance variables and other methods not shown

    private static int getNumDigits(int number) {
        int count = 0;
        if (number > 0) {
            count = 1 + getNumDigits(number / 10);
        } 
        else {
            return 0;
        }
        return count;
    }

    public static int[] getSortedDigitArray(int number) {
        int[] sorted = new int[getNumDigits(number)];
        int count = getNumDigits(number)-1;
        int temp = number;
        do {
            sorted[count] = temp % 10;
            count--;
            temp = temp / 10;
        } while (temp > 0);
        
        int min;
        for(int i = 0; i < sorted.length; i++){
            min = i;
            for(int j = i; j < sorted.length; j++){
                if(sorted[j]<sorted[min]){
                    min = j;
                }
            }
            swap(sorted, i, min);
        }

        return sorted;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}