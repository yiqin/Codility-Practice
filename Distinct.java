// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[][] counter = new int[A.length][2];
        int distinct = 0;
        
        for(int i=0; i< A.length; i++) {
            boolean newValue = true;
            for(int j=0; j< distinct; j++) {
                if(A[i] == counter[j][0] && counter[j][1] != 0) {
                    newValue = false;
                }
            }
            
            if(newValue) {
                counter[distinct][0] = A[i];
                counter[distinct][1] = 1;
                distinct++;
            }
            
        }
        return distinct;
        
    }
}


With sorting feature (100 scores)
// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays; 

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        // System.out.println(Arrays.toString(A));
        
        int distinct = 0;
        int currentDistinceValue = 0;
        
        for(int i=0; i<A.length; i++) {
            if(i==0) {
                currentDistinceValue = A[i];
                distinct = 1;
            }
            
            if(currentDistinceValue == A[i]) {
                
            }
            else {
                currentDistinceValue = A[i];
                distinct++;
            }
            
        }
        
        return distinct;
    }
}
