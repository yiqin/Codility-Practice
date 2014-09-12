// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int count = 0;
        
        for(int i=0; i<A.length; i++) {
            if (A[i] == 0) {
                for(int j=i; j<A.length; j++) {
                    if (A[j] == 1) {
                        count++;
                    }
                }
                
            }
        }
        
        if (count<1000000000) {
            return count;
        }
        else {
            return -1;
        }
        
    }
}