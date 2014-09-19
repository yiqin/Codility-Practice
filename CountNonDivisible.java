// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        
        int[] results = new int[A.length];
        
        for (int i=0; i<A.length; i++) {
            count = 0;
            int currentInteger = A[i];
            
            // System.out.println(currentInteger);
            
            for (int j=0; j<A.length; j++) {
                if (currentInteger%A[j]!=0) {
                    // System.out.println("......"+A[j]);
                    count++;
                }
            }
            
            results[i] = count;
        }
        
        return results;
    }
}