package interview;

public class QueueLink {
Node head,front,rear;

public void enqueue(int x){
	Node n1=new Node(x);
	if(head==null){
		head=n1;
		front=n1;
		rear=n1;
		return;
	}
	Node temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=n1;
	rear=n1;
}

public int dequeue(){
	if(head==null){
		return 0;
	}
	int x=front.data;
	head=head.next;
	front=head;
	return x;
}

public int returnFront(){
	if(head==null){
		return 0;
	}else{
		return front.data;
	}
}

public int returnRear(){
	if(head==null){
		return 0;
	}else{
		return rear.data;
	}
}

public boolean isEmpty(){
	if(head==null){
		return true;
	}else{
		return false;
	}
}

}
