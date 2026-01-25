import java.util.*;

public class Main11 {
    public static void main(String[] args){
        System.out.println("hello");
        int[] a={1,2,3,4,5,6,7,11,-1,0};
        System.out.println("Minimum sum in the subarray of size k=3 is "+minSub(a,3));
        int[] l={1,2,1};
        nextGreater2(l);
        minSubarraySum(l);
        int[][] m={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        antiDiagonal(m);
        antiDiagonalR(m);
        System.out.println();
        System.out.println("Ploynomial expression value is "+computePolyValue(3,3,a));
        symmetricMatrix();
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
               //s+=IntStream.of(l1).min();
            }
            
            
        }
    }
    static void antiDiagonal(int[][] a){
        int n=a.length;
        System.out.println("Matrix given is : ");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(j==n-1){
                    System.out.print(a[i][j]+" ");
                n--;}
                }
                System.out.println(" ");
        }
    }
    static void antiDiagonalR(int[][] a){
        int n=a.length;
        System.out.println("Reverse Anti-Diagonal:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i][n-1-i]+" ");
        }
    }
    static int computePolyValue(int n, int x, int[] a) {
    int result = a[0];

    for (int i = 1; i <= n; i++) {
        result = result * x + a[i];
    }

    return result;
    }
    static void symmetricMatrix(){
        int[][] matrix=new int[3][3];
        Scanner sc=new Scanner(System.in);
        
        for(int[] row: matrix){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]==-1 && matrix[j][j]==-1){
                    System.out.println("Give value for symmetric pos ");
                    int v=sc.nextInt();
                    matrix[i][j]=v;
                    matrix[j][i]=matrix[i][j];
                }
                System.out.println("Give value of non symmetric pos ");
                int v=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}