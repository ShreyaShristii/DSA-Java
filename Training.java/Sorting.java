import java.util.*;
public class Sorting {
    public static void main(String args[]){
        System.out.println("Sorting Techniques");
        int[] a={6,12,46,2,13,67,33,9,214,53,1,31};
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(bubble(a)));
        int[] b={134,14,146,2,5,-2 };
        insertionSort(b);
        System.out.println(Arrays.toString(b));
        int[] c={12,4,8,4,746,1,0};
        SelectionSort(c);
        System.out.println(Arrays.toString(c));
        
    }
    public static int[] bubble(int[] a){
        boolean s=true;
        int i=0;
        while(s){
            s=false;
            i=0;
            while(i<a.length-1){
                
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                s=true;
            }
            i++;
        }
    }
    return a;
}
public static int[] insertionSort(int[] a){
    int n=a.length;
    for(int i=1;i<n;i++){
        int key=a[i];
        int j=i-1;
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j-=1;
        }
        a[j+1]=key;
    } 
    return a;
}
public static int[] SelectionSort(int[] a){
    int n=a.length;
    for(int i=0;i<n;i++){
        int s=i;
        for(int j=i+1;j<n;j++){
            if(a[j]<a[s]){
                s=j;
            }
        } 
        int t=a[s];
        a[s]=a[i];
        a[i]=t;
    }
    return a;
}
}