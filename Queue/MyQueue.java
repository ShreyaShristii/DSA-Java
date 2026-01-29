public class MyQueue {
    public static void main(String args[]){
        ArrayQueue q=new ArrayQueue(11);
        q.push(10);
        q.push(9);
        q.push(8);
        q.push(8);
        q.push(7);
        q.push(10);
        q.push(9);
        q.push(8);
        q.push(8);
        q.push(7);
        q.push(23);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println("next element to be removed is:"+q.peek());
        
    }

}
class ArrayQueue{
    private int front;
    private int rear;
    private int size;
    private int[] queue;
    public ArrayQueue(int n){
        size=n;
        front=-1;
        rear=-1;
        queue=new int[n];
         
    }
    public void push(int n){
        if(front==-1 && rear==-1 && size>0){
            queue[++front]=n;
            rear++;
        }
        else if(rear!=size-1){
        queue[++rear]=n;}
        else{
            System.out.println("Queue is full you guysss!!");
        }
    }
    synchronized public int pop(){
        if(front==-1) {
            System.out.println("Queue underflow");
            return -1;
        }
        int r=queue[front++];
        if(front>rear){
            front=-1;
            rear=-1;
        }
        return r;
    }
    public int peek(){
        if(front==-1){
            System.out.println("No element in the queue");
            return -1;
        }
        return queue[front];
    }
}
