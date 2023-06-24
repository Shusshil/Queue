package Queue;

public class Array {
	public static void main(String[] args) {
	    QueueA q = new QueueA(6);
	    System.out.println(q.isEmpty());
	    q.enqueue(1);
	    System.out.println(q.isEmpty());
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);
	    System.out.println("size = " + q.size() + " front element = " + q.front());
	    q.enqueue(6);
		System.out.println("size = " + q.size() + " front element = " + q.front());
		q.dequeue();
		System.out.println("size = " + q.size() + " front element = " + q.front());
		q.dequeue();
		System.out.println("size = " + q.size() + " front element = " + q.front());
	}
}
class QueueA{
    private int front;
    private int rear;
    private int arr[];
    private int maxsize;
    
    QueueA(int size){
        maxsize = size;
        arr = new int[size];
        front = rear = -1;
    }
    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }
    public int front(){
        if(rear == -1 || front > rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int value){
        if((rear + 1) == maxsize){
            System.out.println("Queue is Full");
            return;
        }
        if(rear == -1){
            arr[++front] = arr[++rear] = value;
            return;
        }
        arr[++rear] = value;
    }
    public void dequeue(){
        if(rear == -1 || front > rear){
            System.out.println("Nothing to Delete in Queue");
            return;
        }
        front++;
    }
    public int size(){
        int s = (rear-front)+1;
        return s;
    }
}
