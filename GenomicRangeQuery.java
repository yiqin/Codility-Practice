// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        
        int M = P.length;
        int[] result = new int[M];
        
        for(int K=0; K<M; K++) {
            int startPoint = P[K];
            int endPoint = Q[K];
            
            String selectedS = S.substring(startPoint,endPoint+1);
            // System.out.println(selectedS);
            
            int minFactor = 0;
            int factor = 0;
            
            for(int i=0; i<selectedS.length(); i++) {
                char type = selectedS.charAt(i);
                
                // System.out.println("type: "+type);
                
                switch(type) {
                    case 'A':
                        minFactor = 1;
                        break;
                    case 'C':
                        minFactor = 2;
                        break;
                    case 'G':
                        minFactor = 3;
                        break;
                    case 'T':
                        minFactor = 4;
                        break;
                }
                // System.out.println("minFactor: "+minFactor);
                
                if (i == 0) {
                    factor = minFactor;
                }
                else {
                    if (factor>minFactor) {
                        factor = minFactor;
                    }
                }
                
            }
            
            result[K] = factor;
        }
        
        
        
        return result;
    }
}