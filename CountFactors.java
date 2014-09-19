// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int numFactors = 0;
        for (int i=1; i<=(double)Math.sqrt(N); i++) {
            
            if (N%i==0 && i*i!=N) {
                numFactors = numFactors+2;
            }
            else if (N%i==0 && i*i==N) {
                numFactors = numFactors+1;
            }
        }
        
        return numFactors;
    }
}
