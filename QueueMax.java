package interview;

public class QueueMax {
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
	if(rear.max<temp.max){
		rear.max=temp.max;
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

public int max(){
	System.out.println("Maximum is "+rear.max);
	return rear.max;
}

}
