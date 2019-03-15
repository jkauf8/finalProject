package Monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
        private String name;
        private int size;
    
	//add a constructor
        public Skeleton(){
            name = "";
            size = 0;
        }
        public Skeleton(String n, int s){
            name = n;
            size = s;
        }
        
	//add code to implement the Monster interface
        public int getHowBig(){
            return size;
        }
        
        public String getName(){
            return name;
        }
        
        public boolean isBigger(Monster other){
            boolean bigger;
            if(size > other.getHowBig()){
                bigger = true;
            }
            else{
                bigger = false;
            }
            return bigger;
        }	
	public boolean isSmaller(Monster other){
            boolean smaller;
            if(size < other.getHowBig()){
                smaller = true;
            }
            else{
                smaller = false;
            }
            return smaller;
        }
	public boolean namesTheSame(Monster other){
            boolean same;
            if(name.toUpperCase().equals(other.getName().toUpperCase())){
                same =true;
            }
            else{
                same =false;
            }
            return same;
        }
        
	//add a toString
        public String toString(){
            return name + " " + size;
        }
}