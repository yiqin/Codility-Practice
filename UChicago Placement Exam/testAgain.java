package testPackage;

import java.util.*;

import java.io.*;

public class testAgain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader freader = new FileReader("/Users/yiqin/testA.text");

		StreamTokenizer tokenizer = new StreamTokenizer(freader);

		int sum = 0;
		int numSum = 0;
		
		int count = 0;
		int used = 0;
		
		boolean isNewLine = true;
		
		while(tokenizer.nextToken() != StreamTokenizer.TT_EOF){

		    if(tokenizer.ttype == StreamTokenizer.TT_WORD) {
		        System.out.print(tokenizer.sval);
		        
		    } else if(tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
		    	int i = (int)tokenizer.nval;
		        if (i==0) {
		        	break;
		        }
		        
		        if(isNewLine) {
		        	isNewLine = false;
		        	System.out.println(i);
		        	count = i;
		        	sum = 0;
		        	numSum = 0;
		        	
		        }
		        else{
		        	if (i>=0) {
			        	sum = sum+i;
			        	numSum++;  
		        	}
		        	used++;
		        }
		        
		        if (count==used) {
		        	isNewLine = true;
		        	int average = sum/numSum;
		        	System.out.println(average);
		        	sum = 0;
		        	used = 0;
		        	count = 0;
		        	numSum = 0;
		        }
		        
		       //  System.out.print(i);
		        
		    } else if(tokenizer.ttype == StreamTokenizer.TT_EOL) {
		        System.out.println("End Of Line.");
		    }
		    
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.peek();
		stack.pop();
		
		System.out.println("hello world" + stack.pop());

	}

}
