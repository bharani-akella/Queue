package interview;

public class QueueMin {
Node head;
Node rear;
Node front;

public void enqueue(int x){
    Node n1=new Node(x);
	if(head==null){
    	head=n1;
    	rear=head;
    	front=head;
    	System.out.println(rear.data+ " has been enqueued");
    	return;
    }
	Node temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=n1;
	rear=n1;
	System.out.println(rear.data+" has been enqueued");
	if(rear.min>temp.min){
		rear.min=temp.min;
	}
}

public int dequeue(){
	if(head==null){
	System.out.println("Queue is empty");
	return 0;
	}
	int x=front.data;
	System.out.println(x+" has been dequeued");
	head=head.next;
	front=head;
	return x;
}

public int min(){
	System.out.println("Minimum is "+rear.min);
	return rear.min;
}

}
