// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        int numFlag = 0;
        int N = A.length;
        if (N>=3) {
            for(int i=1; i<N-1; i++) {
                if (A[i]>A[i-1] && A[i]>A[i+1]) {
                    peaks.add(i);
                }
            }
            
            for(int i=0; i<peaks.size(); i++) {
                System.out.println(peaks.get(i));
                
            }
            
        }
        
        System.out.println("Peaks size: "+peaks.size());
        return 0;
    }
}
