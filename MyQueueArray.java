package interview;

public class MyQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         QueueArrayTools obj=new QueueArrayTools(5);
             obj.enqueue(10);
             obj.enqueue(20);
             obj.enqueue(30);
             obj.enqueue(40);
             obj.enqueue(50);
             obj.dequeue();
             obj.dequeue();
             obj.dequeue();
             obj.returnFront();
             obj.returnRear();
         obj.isEmpty();
	}

}
