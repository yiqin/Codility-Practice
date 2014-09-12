// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        
        int positiveCount = 0;        
        for(int i=0; i< A.length; i++) {
            positiveCount++;
        }
        
        int[] B = new int[positiveCount];
        
        for(int i=0; i<A.length; i++) {
            if(A[i]<=A.length && A[i]>0) {
                B[A[i]-1]=1;
            }
        }
        
        int min = B.length+1;
        
        for(int i=0; i<B.length; i++) {
            if(B[i]==0) {
                // min = B[i]+1;
                min = i+1;
                break;
            }
        }
        
        return min;
    }
}
