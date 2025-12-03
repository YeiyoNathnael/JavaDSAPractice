public class StackAlgorithms {
    
	public static void main(String[] args) {
    		//Tests
		//ToDo
	}

	//Algorithm5.2: Write a method that receive two stacks’ objects S1 and S2.
	// The method returns true if the two stacks are identical, false otherwise. 
	//The two stacks should be unchanged when the method terminates.
	public boolean Algorithm1(Stack<E> s1,Stack<E> s2) {
		Stack<E> s1_cpy = new Stack<>();
		Stack<E> s2_cpy = new Stack<>();
		boolean identical = true;
		
		while(!s1.isEmpty()){
			s1_cpy.push(s1.pop());
		}
		while(!s2.isEmpty()){
			s2_cpy.push(s2.pop());
		}

		while(!s1_cpy.isEmpty() && !s2_isEmpty()){
			E temp1 = s1_cpy.pop();
			E temp2 = s2_cpy.pop();
		
			if(temp1.equals(temp2)) identical = false;
			s1.push(temp1);
			s2.push(temp2);
		}
		while(!s1_cpy.isEmpty()) s1.push(s1_cpy.pop());
		while(!s2_cpy.isEmpty()) s2.push(s2_cpy.pop());

		return identical && s1.size() == s2.size();
		
		
	}

	//Algorithm5.6: Given a stack of elements S1,
	// you are requested to create an exact copy of S1 leaving S1 unchanged.
	// Use only the stack predefined methods and an additional data structure object
	public Stack<E> Algorithm2(Stack<E> s) {
		ArrayList<E> list = new ArrayList<>();
		Stack<E> s_cpy = new Stack<>();

		while(!s.isEmpty()){
			list.add(s.pop());
		}
		for(E item:list){
			s.push(item);
			s_cpy.push(item);
		}
		return s_cpy;
	}
}

