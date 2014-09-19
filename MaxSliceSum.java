// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int max_ending = A[0];
        int max_slice = A[0];
        
        for (int i=1; i<A.length; i++) {
            if (max_ending<0) {
                max_ending = A[i];
            }
            else {
                max_ending = max_ending + A[i];
            }
            if (max_ending>max_slice) {
                max_slice = max_ending;
            }
        }
        
        return max_slice;
        
    }
}
