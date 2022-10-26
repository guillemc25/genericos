import java.util.NoSuchElementException;

public class StackArray <T>{
	
	  private T[] arrayGenerico; // Array de tipo genérico
	    private int contador; 
	    
	    public StackArray() {
	    	
		
	}
	    
	public boolean isEmpty() {
		
		  return contador == 0;
		
	}
	
	public boolean add(T objeto) {
		 if (contador == arrayGenerico.length) {
	            return false;
	        } else {
	            arrayGenerico[contador] = objeto;
	            contador++;
	            return true;
	        }
	}
	
	public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return arrayGenerico[0];
        }
    }
	
	public T removeFirst() {
		 if (isEmpty()) {
	            throw new NoSuchElementException();
	        } else {
	        	contador--;
	            return arrayGenerico[contador];
	        }
	}

    public String toString() {
        return arrayGenerico.toString();
    }
}


	    
