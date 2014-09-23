package testPackage;

import java.io.*;

public class testB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader fileReader = new FileReader("/Users/yiqin/testB.text");
		
		StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
		
		while(tokenizer.nextToken() != StreamTokenizer.TT_EOF){
			
			// System.out.println("Receiced something from the file");
			// System.out.println(tokenizer.ttype);
			
			if(tokenizer.ttype==StreamTokenizer.TT_WORD){
				// System.out.println("WORD "+tokenizer.sval);
				String currentString = tokenizer.sval;
				
				if(currentString.equals("END")){
					//System.out.println("  End");
					break;
				}
				else {
					// System.out.println("WORD "+currentString);
					char firstChar = currentString.charAt(0);
					// currentString.su
					int count = 0;
					for(int i=0; i<currentString.length(); i++) {
						if(firstChar == currentString.charAt(i)) {
							count++;
						}
					}
					System.out.println(count);
				}
			}
		}
		

	}

}
