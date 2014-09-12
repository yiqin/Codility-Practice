// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int hasTriangular = 0;
        // System.out.print(Arrays.toString(A));
        
        if (A.length < 3) {
            hasTriangular = 0;
        }
        else {
            int P = 0;
            int Q = 1;
            int R = 2;
            
            for(int i= 2; i<A.length; i++) {
                if(A[P]+A[Q]>A[R] && A[P]>0 && A[Q]>0 && A[R]>0) {
                    hasTriangular = 1;
                    break;
                }
                else {
                    P++;
                    Q++;
                    R++;
                }   
            }
        }
        
        return hasTriangular;
    }
}
