package testPackage;

import java.io.*;

public class myTestRecursive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println(fibonacci(6));
		
		Reader fileReader = new FileReader("/Users/yiqin/testB.text");
		
		StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
		
		boolean isNewData = true;
		
		
		while(tokenizer.nextToken() != StreamTokenizer.TT_EOF){
			if(tokenizer.ttype == StreamTokenizer.TT_WORD) {
				String currentString = tokenizer.sval;
				
				if(currentString.equals("END")){
					
				}
			}
			else if(tokenizer.ttype == StreamTokenizer.TT_NUMBER){
				int currentNumber = (int)tokenizer.nval;
			}
			else if(tokenizer.ttype == StreamTokenizer.TT_EOL){
				
			}
			
			
		}
		
		
	}
	
	
	public static int something1(int n) {
		
		return 0;
	}
	
	private static int something2(int n) {
		
		return 0;
	}
	

	public static int fibonacci(int n)  {
		
		System.out.println("fibonacci: "+n);
		
	    if(n == 0) {
	        return 0;
	    }
	    else if(n == 1) {
	      return 1;
	    }
	   else {
	      return fibonacci(n - 1) + fibonacci(n - 2);
	   }
	}
}
