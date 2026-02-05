import java.util.*;
public class Day13{
    public static void main(String args[]){
        System.out.println("Today we will learn about HashMap");
        String s1="Shreya";
        String s2="Shristi";
        printChar(s1,s2);
    }
    public static void printChar(String s1,String s2){
        HashSet<Character> s=new HashSet<>();
        for(char c:s1.toCharArray()){
            s.add(c);
        }
        for(char c:s2.toCharArray()){
            if(!(s.contains(c))){
                System.out.print(c);
            }
        }
    }
}