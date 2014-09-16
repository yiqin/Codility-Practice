// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[][] disc = new int[A.length][2];
        
        for(int i=0; i<A.length; i++) {
            int downBound = i-A[i];
            int upBound = i+A[i];
            
            disc[i][0] = downBound;
            disc[i][1] = upBound;
            
            // System.out.println(Arrays.toString(disc[i]));
        }
        
        int pairCounter = 0;
        for(int i= 0; i<A.length-1; i++) {
            
            for(int j=i+1; j< A.length; j++) {
                if(disc[i][1] >= disc[j][0]) {
                    pairCounter++;
                }
                else {
                    //break;
                }
            }
        }
        
        return pairCounter;
    }
}