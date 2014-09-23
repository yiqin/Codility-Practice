package testPackage;

import java.io.*;
import java.util.*;

public class testD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader fileReader = new FileReader("/Users/yiqin/testD.text");
		StreamTokenizer tokenizer = new StreamTokenizer(fileReader);
		
		int rowNum = 0;
		int columnNum = 0;
		int totalInteger = 0;
		
		int importSizeData = 0;
				
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		while(tokenizer.nextToken()!=StreamTokenizer.TT_EOF){
			if(tokenizer.ttype==StreamTokenizer.TT_NUMBER) {
				// System.out.println(tokenizer.nval);
				int currentImportNumber = (int)tokenizer.nval;
				if(importSizeData==0){
					rowNum = currentImportNumber;
					importSizeData++;
				}
				else if(importSizeData==1){
					columnNum = currentImportNumber;
					if(rowNum==0&&columnNum==0){
						break;
					}
					totalInteger = rowNum*columnNum;
					importSizeData++;
				}
				else {
					data.add(currentImportNumber);					
					totalInteger--;
					// break;
				}
				if(totalInteger==0&&importSizeData==2){
					System.out.println("Matrix is save.");
					countingMine(data,rowNum,columnNum);
					data.clear();
					importSizeData=0;
				}
			}
		}

	}
	
	private static void countingMine (ArrayList<Integer> data, int rowNum, int columnNum ){
		int[][] matrix = new int[rowNum+2][columnNum+2];
		int index=0;
		
		for(int i=1; i<=rowNum; i++){
			for(int j=1; j<=columnNum; j++){
				int currentNum = data.get(index);

				// This is wrong.
				// matrix[i][j]=currentNum;
				if(currentNum==1){
					matrix[i][j]=-1;
					System.out.println("i="+i+", j"+j);
					for(int ii=i-1;ii<=i+1;ii++){
						for(int jj=j-1;jj<=j+1;jj++){
							
							if(matrix[i][j]<=0){
								matrix[ii][jj]++;
							}							
						}
					}
				}
				// System.out.print(currentNum);
				index++;
			}
			// System.out.print("\n");
		}
		
		for(int i=1; i<=rowNum; i++){
			for(int j=1; j<=columnNum; j++){
				if(true){
					// System.out.println("i="+i+", j:"+j+"\n"+matrix[i][j]);
					System.out.print(matrix[i][j]);
				}

			}
			System.out.print("\n");
		}
			
	}		
}
