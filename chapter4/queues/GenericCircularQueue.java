public class GenericCircularQueue<E> {
	public static final int INITIAL_CAPACITY = 16;
	private int front = -1, rear = -1;
	private E[] data = (E[])(new Object[INITIAL_CAPACITY]);
	
	public void GenericCircularQueueV2(){}
	public void GenericCircularQueueV2(E[] objects){
		// Create a queue from an array of objects
		for(int i = 0; i < objects.length;i++) 
			enqueue(objects[i]);
	}

	public E Dequeue (){ // Remove an element from the head of the queue
		E firstElement = data[front];
		if(front == rear)
			return null;
		else if(front < rear )
			front = front + 1;
		else front = (front+1)% data.length;
		retrurn firstElement;
		
	}
	public void enqueue(E e){
		ensureCapacity();
		if(rear == data.length -1){
			data[0] = e;
			rear = 0;
		}
		else{
			rear = rear + 1;
			data[rear] = e;
			if(front == -1) front = 0;
		}
	}
	// Create a new larger array, double the current size +1

	private void ensureCapacity(){
		int size = size();
		if(size >= data.length){
			int newSize = 2*size;
			E[] newData = (E[])(new Object[newSize]);
			if(front <= rear)
				System.arraycopy(data,front, newData,front,size );
			else{
				System.arraycopy(data,0 , newData,0 ,rear+1);
				System.arraycopy(data,front , newData,size+front ,size-rear+1 );
				front = size+front;
			}
			data = newData;
		}
	
	}
	public boolean isEmpty(){ return front == -1;}

	public int size(){
		if(isEmpty()) return 0;
		
		if(front <=rear) return rear-front;
		
		return rear+1+data.length-front;
	}
	
	public void clear(){
		data = (E[])new Object[INITIAL_CAPACITY];
		front = -1;
		rear = -1;
	}
	
	
	

}

