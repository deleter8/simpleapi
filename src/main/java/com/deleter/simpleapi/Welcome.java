package com.deleter.simpleapi;

import com.fasterxml.jackson.annotation.*;

public class Welcome {

    @JsonProperty("message") 
    private String message;
    
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String value){
		message = value;
	}
	
	public Welcome() {
		message = "Hello and welcome!";
	}
}