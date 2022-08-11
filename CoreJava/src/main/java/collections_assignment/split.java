package collections_assignment;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		  String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split(" ");  
	      for(int i=0;i<sentences.length;i++){
	    	  System.out.println(sentences[i]);
	      }

	}

}
