import java.util.*;
public class Main{
    public static void main(String args[]){
        int[] arr={1,2,3,1,2,4,3,1};
        int[] hash=new int[13];
        for(int i=0;i<8;i++){
            hash[arr[i]]+=1;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Give the numer whose frequesncy you need to check");
        int n=sc.nextInt();
        System.out.println(hash[n]);
        int[] hash1=new int[26];
        //char[] arr2={'q','a','a','b','c','c','z'};
        String s="abceadbskdfjeas";
        ArrayList<Character> arr2=new ArrayList<>();
        for(char c: s.toCharArray()){
            arr2.add(c);
        }
        for(int i=0;i<arr2.size();i++){
            int asciiValue=(int)(arr2.get(i));
            System.out.println("Ascii Value of "+arr2.get((i))+" is "+asciiValue);
            int index=asciiValue-97;
            hash1[index]+=1;
        }
        System.out.println(Arrays.toString(hash1));
    }
}