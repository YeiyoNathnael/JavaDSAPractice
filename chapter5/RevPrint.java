import java.util.*;
public class RevPrint {
	
	LinkedList<E> list = new LinkedList<>();
	
	public static void RevPrint(){
		RevPrintImpl(list.head);
	}
	public static void RevPrintImpl(Node<E> head){
		if (head != null)}{
			RevPrintImpl(head.next);
			System.out.println(head.element);
		}
		
	}
	
}

