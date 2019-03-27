package TheWordSearch;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
import java.io.*;

public class WordSearch {

    private String[][] m;

    public WordSearch(int size, String str) {
        m = new String[size][size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j] = str.substring(count,count+1);
                count++;
            }
        }
    }

    public boolean isFound(String word) {
        boolean isFound = false;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length-word.length(); j++){
                if(checkRight(word, i, j)||checkLeft(word, i, j)){
                    isFound = true;
                    return isFound;
                }
            }
        }
        for(int i = 0; i < m.length-word.length(); i++){
            for(int j = 0; j < m.length; j++){
                if(checkUp(word, i, j)||checkDown(word, i, j)){
                    isFound = true;
                    return isFound;
                }
            }
        }
        for(int i = 0; i < m.length-word.length(); i++){
            for(int j = 0; j < m.length-word.length(); j++){
                if(checkDiagUpLeft(word, i, j)||checkDiagDownRight(word, i, j)){
                    isFound = true;
                    return isFound;
                }
            }
        }
        for(int i = m.length-1-word.length(); i < m.length; i++){
            for(int j = 0; j < m.length-word.length(); j++){
                if(checkDiagUpRight(word, i, j)||checkDiagDownLeft(word, i, j)){
                    isFound = true;
                    return isFound;
                }
            }
        }
        
        return isFound;
    }

    public boolean checkRight(String w, int r, int c) {
        boolean exists = false;
        String[] word = w.split("");
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = c; k < c+word.length; k++){
                if(!m[r][k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }
    public boolean checkLeft(String w, int r, int c) {
        boolean exists = false;
        String[] word = new String[w.length()];
        int count = w.length();
        for(int i = 0; i < w.length() && count > 0; i++){
            word[i] = w.substring(count-1, count);
            count--;
        }
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = c; k < c+word.length; k++){
                if(!m[r][k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }

    public boolean checkUp(String w, int r, int c) {
        boolean exists = false;
        String[] word = new String[w.length()];
        int count = w.length();
        for(int i = 0; i < w.length() && count > 0; i++){
            word[i] = w.substring(count-1, count);
            count--;
        }
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = r; k < r+word.length; k++){
                if(!m[k][c].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }
    public boolean checkDown(String w, int r, int c) {
        boolean exists = false;
        String[] word = w.split("");
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = r; k < r+word.length; k++){
                if(!m[k][c].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }

    public boolean checkDiagUpRight(String w, int r, int c) {
        //done
        boolean exists = false;
        String[] word = w.split("");
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = 0; k < word.length; k++){
                if(!m[r-k][c+k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        boolean exists = false;
        String[] word = new String[w.length()];
        int count = w.length();
        for(int i = 0; i < w.length() && count > 0; i++){
            word[i] = w.substring(count-1, count);
            count--;
        }
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = 0; k < word.length; k++){
                if(!m[r+k][c+k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        boolean exists = false;
        String[] word = new String[w.length()];
        int count = w.length();
        for(int i = 0; i < w.length() && count > 0; i++){
            word[i] = w.substring(count-1, count);
            count--;
        }
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = 0; k < word.length; k++){
                if(!m[r-k][c+k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }
    public boolean checkDiagDownRight(String w, int r, int c) {
        boolean exists = false;
        String[] word = w.split("");
        int index = 0;
        if(m[r][c].equals(word[index])){
            exists = true;
            for(int k = 0; k < word.length; k++){
                if(!m[r+k][c+k].equals(word[index])){
                    return false;
                }
                index++;
            }
        }
        return exists;
    }
    public String toString() {
        String output = "";
        for(String[] l : m){
            for(String s : l){
                output += s + " ";
            }
            output += "\n";
        }
        return output;
    }
}