package interview;
import java.util.*;
public class QueueArrayTools {

	int q[];
	int capacity;
	int rear;
	int front;
	int size;
	
	public QueueArrayTools(int c){
		capacity=c;
		q=new int[c];
		rear=capacity-1;
		front=size=0;
	}
	
	public void enqueue(int x){
		if(size==capacity){
			System.out.println("Queue is full..cannot insert!");
			return;
		}
		rear=(rear+1)%capacity;
		q[rear]=x;
		size=size+1;
		System.out.println("The element enqueued is "+q[rear]);
	}
	
	public int dequeue(){
		if(size==0){
			System.out.println("Queue underflow...cannot delete!");
			return 0;
		}
		int x=q[front];
		System.out.println("Element dequeued is "+x);
		front=(front+1)%capacity;
		size=size-1;
		return x;
	}
	
	public void isFull(){
		if(size==capacity){
			System.out.println("Queue is full");
			return;
		}else{
			System.out.println("You can still insert "+(capacity-size)+" elements!!");
		}
	}
	
	public void isEmpty(){
		if(size==0){
			System.out.println("Queue is empty!!");
			return;
		}else{
			System.out.println("You can still delete "+(size) +" elements");
		}
	}
	
	public int returnFront(){
		if(size==0){
			System.out.println("Queue is empty");
			return 0;
		}else{
			System.out.println("front element is "+q[front]);
			return q[front];
		}
	}
	
	public int returnRear(){
		if(size==0){
			System.out.println("Queue is empty");
			return 0;
		}else{
			System.out.println("rear element is "+q[rear]);
			
			return q[rear];
		}
	}
	
}
