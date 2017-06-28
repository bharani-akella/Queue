package interview;

public class QueueUsingStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Stack s1=new Stack();
                   Stack s2=new Stack();
                   
                   QueueUsingStackMain obj=new QueueUsingStackMain();
                   obj.enqueue(s1, 10);
                   obj.enqueue(s1, 20);
                   obj.enqueue(s1, 30);
                    obj.dequeue(s1, s2);
                    obj.dequeue(s1, s2);
                    obj.dequeue(s1, s2);
                    obj.dequeue(s1, s2);
                    
	}
	
	public void enqueue(Stack stack1,int x){
		stack1.push(x);
		System.out.println(stack1.returnTop()+" is enqueued");
	}
	
	public int dequeue(Stack stack1, Stack stack2){
		if(stack2.isEmpty()){
			if(stack1.isEmpty()){
				System.out.println("Queue underflow");
				return 0;
			}else{
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());	
				}System.out.println(stack2.returnTop()+" has been dequeued");
				int x= stack2.returnTop();
				stack2.pop();
				return x;
			}
		}else{
			System.out.println(stack2.returnTop()+" has been dequeued");
			int x= stack2.returnTop();
			stack2.pop();
			return x;

		}
	}

}
