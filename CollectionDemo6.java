package hit.day28;


public class CollectionDemo6 {

	public static void main(String[] args) {
	    Queue q=new Queue();
	    
	    q.enQueue(1);
	    
	    q.enQueue(2);
	    
	    q.enQueue(3);
	    
	    System.out.println("Elements present is: ");
	    
	    q.show();
	    
	    System.out.println();
	    
	    q.deQueue();
	    
	    System.out.println("After dequeue elements present in the list is  :");
	    q.show();
	    
	    q.deQueue();
	    
	    System.out.println();
	    
	    System.out.println("After dequeue elements present in the list is  :");
	    
	    q.show();
	         
	}

}
class Queue
{
	
	int Queue[] =new int[10];
	
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		Queue[rear]=data;
		rear=rear+1;
		size=size+1;
		
	
	}
	
	
	public void deQueue() {
		
		int data=Queue[front];
		
		front=front+1;
		
		size=size-1;
		
		}
		
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(Queue[front+i]+" ");
	}

}
}
