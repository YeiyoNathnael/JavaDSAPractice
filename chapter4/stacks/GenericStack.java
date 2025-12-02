import java.util.*;
public class GenericStack<E> {

/*Operations: 

- Push() : adds to the top of the stack.✓ 
- Pop() : takes the top element off the stack.✓
- getSize() .✓
- IsEmpty : checks if the stack is empty.✓
- Top : returns a copy of the top element.✓

*/

	LinkedList<E> list = new LinkedList<>();
	
	public boolean IsEmpty(){
		return getSize() == 0;
	}
	public int getSize(){
		return list.size();
	}
	public void push( E element){
		list.add(element);
	}
	public E pop(){
		E popped = list.get(getSize() - 1);	
		list.remove(list.get(getSize() - 1);
		return popped;
	}
	public E peek(){
		E Topped = list.get(getSize() - 1);	
		return popped;
	}
	
	
		

}

