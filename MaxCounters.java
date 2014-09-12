// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] XArray = new int[N];
        
        for(int i=0; i<A.length; i ++) {
            if(A[i]>=1 && A[i]<=N) {
                XArray = increase(A[i],XArray);
            }
            else if (A[i] == N+1) {
                XArray = maxCounter(XArray);
            }
            
        }
        
        return XArray;
    }
    
    private int[] increase(int X, int[] XArray) {
        XArray[X-1]++;
        return XArray;
    }
    
    private int[] maxCounter(int[] XArray) {
        int maxValue = 0;
        
        for (int i=0; i< XArray.length; i++) {
            if (XArray[i]>maxValue) {
                maxValue = XArray[i];
            }
        }
        
        for (int i=0; i< XArray.length; i++) {
            XArray[i] = maxValue;
        }
        
        return XArray;
    }
}