// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Arrays.sort(A);
        
        int maxTriplet = 0;
        int N = A.length;
        

        if(A[0]*A[1]>0 && A[0]<0) {
            if(A[0]*A[1]*A[N-1]>A[N-3]*A[N-2]*A[N-1]){
                maxTriplet = A[0]*A[1]*A[N-1];
            }
            else{
                maxTriplet = A[N-3]*A[N-2]*A[N-1];
            }    
        }
        else{
            maxTriplet = A[N-3]*A[N-2]*A[N-1];
        }
        
        return maxTriplet;
    }
}
