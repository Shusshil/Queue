package Queue;

public class Linked {
	public static void main(String[] args) {
	    Queue q = new Queue();
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
class NodeQ{
    NodeQ next;
    int data;
    NodeQ(int data){
        this.data = data;
        next = null;
    }
}
class Queue{
    private NodeQ front;
    private NodeQ rear;
    private int currSize;
    
    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
    public int front(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }
    public void enqueue(int value){
        NodeQ node = new NodeQ(value);
        currSize++;
        if(rear == null){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }
    public void dequeue(){
        if(front == null){
            System.out.println("Nothing to Delete in Queue");
            return;
        }
        NodeQ node = front;
        front = front.next;
        node.next = null;
        
        if(front == null){
            rear = null;
        }
        currSize--;
    }
    public int size(){
        return currSize;
    }
}