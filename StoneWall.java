// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.LinkedList;

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        int numberOfBlocks = 0;
        
        for (int i=1; i<H.length; i++) {
            int previous =  H[i-1];
            int current = H[i];
            
            if(previous != current) {
                numberOfBlocks++;
            }
        }
        
        return numberOfBlocks;
    }
}


import java.util.*;

class Solution {

    public int solution(int[] H) {
        int numBlocks = height.length;
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        Stack<Integer> passedHeights = new Stack<Integer>();

        // situations where we can change blocks

        for(int i = 1; i < H.length; i++){
            if(H[i] == H[i-1]){
                numBlocks -= 1;
                isDecreasing = false;
            } else if(H[i] > H[i-1]){
                isDecreasing = false;
                passedHeights.push(H[i-1]);
            } else {
                isDecreasing = true;
            }

            if(isDecreasing){
                while(!passedHeights.empty() && H[i] < passedHeights.peek()){
                    passedHeights.pop();
                }
                if(!passedHeights.empty() && H[i] == passedHeights.peek()){
                    numBlocks -= 1; 
                }
            }
        }

        return numBlocks;
    }
}

import java.util.*;

class Solution {

    public int solution(int[] H) {
        int numBlocks = 0;
        boolean isDecreasing = true;
        Stack<Integer> passedHeights = new Stack<Integer>();

        // situations where we can change blocks

        for(int i = 1; i < H.length; i++){
            if(H[i] == H[i-1]){
                // numBlocks -= 1;
                isDecreasing = false;
            } else if(H[i] > H[i-1]){
                isDecreasing = false;
                passedHeights.push(H[i-1]);
            } else {
                isDecreasing = true;
                numBlocks++;
            }

            if(isDecreasing){
                while(!passedHeights.empty() && H[i] < passedHeights.peek()){
                    passedHeights.pop();
                    numBlocks++;
                }
                if(!passedHeights.empty() && H[i] == passedHeights.peek()){
                    // numBlocks++; 
                }
            }
        }
        
        numBlocks += passedHeights.size();
        
        return numBlocks;
    }
}