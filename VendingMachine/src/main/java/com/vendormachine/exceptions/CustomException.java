package com.vendormachine.exceptions;

public class CustomException  extends Exception {
     String errorMessage;
     
     public CustomException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
     
     public String toString() {
    	 return errorMessage;
     }
}
