// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int perimeter = 0;
        
        for (int i=1; i<=Math.sqrt(N); i++) {
            if (N%i == 0) {
                int currentPerimeter = 2*(i+N/i);
                
                if (perimeter == 0) {
                    perimeter = currentPerimeter;
                }
                
                if (perimeter > currentPerimeter) {
                    perimeter = currentPerimeter;
                }
            }
        }
        
        return perimeter;
    }
}
