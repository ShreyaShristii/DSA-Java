import java.util.*;
public class JavaQueue {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        //System.out.println(q.peek());
        //reverseQ(q, s);
        //printQ(q);
        //reverseK(q,2);

        //interLeave(q,s);
        //printQ(q);
        int[] a={12,-1,-7,8,-15,30,16,28};
        firstNegative(a,3);

    }
    static void reverseQ(Queue<Integer> q,Stack<Integer> s){
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        // while(!q.isEmpty()){
        //     System.out.println(q.poll());
        // }
        
    }
    static void printQ(Queue<Integer> q){
        System.out.println("Printing the queue elements ");
        int n=q.size();
        for(int i=0;i<n;i++){
       int r=q.poll();
       System.out.println(r);
        q.add(r);}
    }
    static void reverseK(Queue<Integer> q,int k){
        System.out.println("Reversing the queue by "+k);
        for(int i=0;i<k;i++){
            q.add(q.poll());
        }
        System.out.print(q.peek());
    }
    static void interLeave(Queue<Integer> q, Stack<Integer> s){
        int n=q.size()/2;
        for(int i=0;i<n;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0;i<n;i++){
            q.add(q.poll());
        }
        
        for(int i=0;i<n;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
            q.add(q.poll());
        }

    }
    static void firstNegative(int[] a,int k){
        Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<k;i++){
            q.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            int c=q.poll();
            if(c<0){
                l.add(c);
            }
            else{
                q.add(a[i]);

            }
        }
        System.out.println(l);

    }
}



