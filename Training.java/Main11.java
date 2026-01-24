import java.util.Arrays;
import java.util.stream.IntStream;
public class Main11 {
    public static void main(String[] args){
        System.out.println("hello");
        int[] a={1,2,3,4,5,6,7,11,-1,0};
        System.out.println("Minimum sum in the subarray of size k=3 is "+minSub(a,3));
        int[] l={1,2,1};
        nextGreater2(l);
        minSubarraySum(l);
    }
    static int minSub(int[] a,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int l=0;
        int r=k;
        int min=sum;
        for(int i=k;i<a.length;i++){
            sum+=a[r++]-a[l++];
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
    static void nextGreater2(int[] a) {
    int n = a.length;
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
        result[i] = -1;

        for (int j = 1; j < n; j++) {
            int idx = (i + j) % n; 

            if (a[idx] > a[i]) {
                result[i] = a[idx];
                break; 
            }
        }
    }
    System.out.println(Arrays.toString(result));
}
    static void minSubarraySum(int[] a){
        int s=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                java.util.ArrayList<Integer> l1=new java.util.ArrayList<>();
                for(int k=i;k<=j;k++){
                    l1.add(a[k]);
                }
               s+=IntStream.of(l1).min();
            }
            
            
        }
    }
}

