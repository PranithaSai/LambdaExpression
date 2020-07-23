package com.epam.lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Strings {
	public static List<String> search(List<String> l) {
	    return l .stream()
	        .filter(s -> s.startsWith("a") && s.length()==3)
	        .collect(Collectors.toList());
	  }
	  
	  public static void main(String args[]) {
	    
	    List<String> list = new ArrayList<String>();
	     list.add("abc"); 
	          list.add("aba"); 
	          list.add("bbbb");
	          list.add("abcded");
	          list.add("bcer");
	          List<String> s = search(list); 
	          System.out.println(s);
	     
	            
	    
	  }

}
