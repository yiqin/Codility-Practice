package testPackage;

import java.io.*;

public class testC {

	public static void main() throws Exception {
		// TODO Auto-generated method stub
		
		Reader fileReader = new FileReader("/Users/yiqin/testC.text");
		
		StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
		
		int num1 = 0;
		int num2 = 0;
		int importNumCount = 0;
		
		while(tokenizer.nextToken() != StreamTokenizer.TT_EOF){
			// System.out.println("Something comes "+importNumCount);
			if(tokenizer.ttype == StreamTokenizer.TT_NUMBER){
				int currentNumber = (int)tokenizer.nval;
				if(importNumCount==0) {
					num1 = currentNumber;
					importNumCount++;
				}
				else if(importNumCount==1) {
					num2 = currentNumber;
					if (num1==0&&num2==0) {
						break;
					}
					else {
						// System.out.println("gcb is here");
						System.out.println(gcb(num1,num2));
						importNumCount=0;
					}
				}				
			}
		}
	}
	
	public static int gcb(int num1, int num2) {
		// System.out.println("Num1  "+num1+"    Num2   "+num2);
		if(num1==num2) {
			return num1;
		}
		else if(num1>num2) {
			// System.out.println("Num1 is larger");
			return gcb(num1-num2,num2);
		}
		else {
			// System.out.println("Num2 is larger");
			return gcb(num1, num2-num1);
		}
		// return num1;
	}
}
