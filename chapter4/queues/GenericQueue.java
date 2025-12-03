import java.util.*;
public class GenericQueue<E> {
	private LinkedList<E> list = new LinkedList<>();
	
	public void enqueue(E e){
		list.addlast(e);
	}
	
	public E dequeue(){
		return list.removeFirst();
	}
	
	public int getSize(){
		return list.size();
	}
}

