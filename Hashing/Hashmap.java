import java.util.*;
public class Hashmap{
    public static void main(String args[]){
String s="adsafnsdvhsicabVSDOI";
HashMap<Character, Integer> map=new HashMap<>();
for(char c: s.toCharArray()){
    if(map.containsKey(c)){
        map.put(c,map.get(c)+1);
    }
    else{
        map.put(c,1);
    }
}
System.out.println(map);
    }
} 
    

