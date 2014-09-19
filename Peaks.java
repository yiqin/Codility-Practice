// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int[] peakArray = new int[A.length];
        
        for (int i=0; i<A.length; i++) {
            int hasPeakInArray = 0;
            
            if (i==0) {
                if(A[i]>A[i+1]) {
                    hasPeakInArray = 1;
                }
            }
            else if (i==A.length-1) {
                if(A[i]>A[i-1]) {
                    hasPeakInArray = 1;
                }                
            }
            else {
                if(A[i]>A[i-1]&&A[i]>A[i+1]) {
                    hasPeakInArray = 1;
                }
            }
            
            if(i==0){
                peakArray[0] = hasPeakInArray;
            }
            else {
                peakArray[i] = peakArray[i-1]+hasPeakInArray;
            }
            
        }
        
        int numBlock = 0;
        boolean hasPeaks = true;
        int blockLength = A.length;
        
        while(hasPeaks){
            numBlock++;
            blockLength = A.length/numBlock;
            
            // System.out.println("Length: "+blockLength);
            
            for(int i=1; i<=numBlock; i++) {
                if (i==1) {
                    if(peakArray[i*blockLength-1]<=0){
                        hasPeaks = false;
                    }
                }
                else if (i==numBlock && i!=1) {
                    if(peakArray[A.length-1]<=peakArray[(i-1)*blockLength]-1){
                        hasPeaks = false;
                    }
                }
                else {
                    if(peakArray[i*blockLength-1]<=peakArray[(i-1)*blockLength]-1 && peakArray[i*blockLength-1]==peakArray[i*blockLength]){
                        hasPeaks = false;
                    }
                }
            }
            
            // System.out.println(numBlock);
        }
        
        return numBlock-1;
    }
}



Correct Answer

import java.util.*;
class Solution {
  public int solution(int[] A) {
    int N = A.length;

    // Find all the peaks
    ArrayList<Integer> peaks = new ArrayList<Integer>();
    for(int i = 1; i < N-1; i++){
      if(A[i] > A[i-1] && A[i] > A[i+1]) peaks.add(i);
    }

    for(int size = 1; size <= N; size++){
      if(N % size != 0) continue; // skip if non-divisible
      int find = 0;
      int groups = N/size;
      boolean ok = true;
      // Find whether every group has a peak
      for(int peakIdx : peaks){
        if(peakIdx/size > find){
          ok = false;
          break;
        }
        if(peakIdx/size == find) find++;
      }
      if(find != groups) ok = false;
      if(ok) return groups;
    }
    return 0;
  }
}