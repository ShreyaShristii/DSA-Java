public class Main11 {
    public static void main(String[] args){
        System.out.println("hello");
        int[] a={1,2,3,4,5,6,7,11,-1,0};
        System.out.println("Minimum sum in the subarray of size k=3 is "+minSub(a,3));
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
}
