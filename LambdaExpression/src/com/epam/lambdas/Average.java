package com.epam.lambdas;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {
	public static void main(String[] args) {
		 IntStream st = IntStream.of(9,6,7,2,3,4,1); 
	     OptionalDouble o = st.average(); 
	     if (o.isPresent()) { 
	         System.out.println(o.getAsDouble()); 
	     } 
	     else { 
	         System.out.println("-1"); 
	     } 
	}

}
