package kodierung;

import java.lang.Exception;

public class EmptyListException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyListException(){
		super();
	}
	
	public EmptyListException(String message){
		super(message);
	}

}
