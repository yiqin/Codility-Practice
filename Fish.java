// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        Stack<Integer> stackForOne = new Stack<Integer>();
        int numFish = 0;
        
        boolean isFirstOneAppreared = false;
        
        for(int i=0; i<A.length; i++) {
            
            if(B[i] == 1) {
                if(!isFirstOneAppreared) {
                    isFirstOneAppreared = true;
                }
                else {
                    
                }
                stackForOne.push(A[i]);
            }
            else {
                if(!isFirstOneAppreared) {
                    // System.out.println(i+": No One");
                    numFish++;
                }
                else {
                    while(!stackForOne.isEmpty() && A[i] > stackForOne.peek()) {
                        stackForOne.pop();
                        System.out.println("pop");
                    }
                    if (stackForOne.isEmpty()) {
                        isFirstOneAppreared = false;
                        numFish++;
                    }
                }
            }
            
            // System.out.println("stack size:"+stackForOne.size());
        }
        
        // System.out.println("numFish:"+numFish);
        
        
        return numFish+stackForOne.size();
    }
}
