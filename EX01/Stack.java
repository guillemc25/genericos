import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack <T> {
	
	LinkedList <T> stack= new LinkedList();
	
	public Stack() {
		
	}
	
	public boolean isEmpty() {
		
		if(stack.size()==0) {
			
			return true;
		}else {
			return false;
		}
			
	}
	
	public T removeFirst() {
		
		
		return (T) stack.removeFirst();
		
		
	}
	
	public T getFirst() {
		
		return (T) stack.get(0);
		
	}
	
	public boolean add(T elemento) {
		
		return  stack.add(elemento);
		
	}

	public String toString() {
		
		return stack.toString();
		
		
	}
	
	
	
	

}
