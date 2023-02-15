package chap10;

public class CustomException extends RuntimeException {
	CustomException(){
		
	}
	
	CustomException(String message){
		super(message);
	}
	
}
