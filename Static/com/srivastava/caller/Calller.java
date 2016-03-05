package com.srivastava.caller;
import static java.lang.System.out;
import static com.srivastava.utils.IValidationUtility.isBlank;

public class Calller {

	public static void main(String[] args) {
		
		
		if(isBlank("")){
			out.println("This is Blank");
		}
		else
		{
			out.println("Not Blank");
		}

	}

}
