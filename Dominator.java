// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        
        int indexDominator = 0;
        
        for (int i=0; i<A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
                indexDominator = i;
            }
            else {
                if (A[i] == stack.peek()) {
                    stack.push(A[i]);
                    indexDominator = i;
                }
                else {
                    stack.pop();
                }
            }    
        }
        
        // System.out.println(stack.size());
        if (stack.size() == 0) {
            indexDominator = -1;
        }
        else if (stack.size() == 1) {
            int count = 0;
            for (int i=0; i<A.length; i++) {
                if(A[i] == A[indexDominator]) {
                    count++;
                }
            }
            if (count <= A.length*0.5) {
                indexDominator = -1;
            }
        }
        // System.out.println(indexDominator);
        return indexDominator;
    }
}

// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        
        int indexDominator = 0;
        
        for (int i=0; i<A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
                indexDominator = i;
            }
            else {
                if (A[i] == stack.peek()) {
                    stack.push(A[i]);
                    indexDominator = i;
                }
                else {
                    stack.pop();
                }
            }    
        }
        
        // System.out.println(stack.size());
        if (stack.size() == 0) {
            indexDominator = -1;
        }
        else if (stack.size() == 1) {
            int count = 0;
            int index = 0;
            for (int i=0; i<A.length; i++) {
                if(A[i] == stack.peek()) {
                    count++;
                    index = i;
                }
            }
            if (count <= (double)A.length*0.5) {
                indexDominator = -1;
            }
            else {
                indexDominator = index;
            }
        }
        // System.out.println(indexDominator);
        return indexDominator;
    }
}

small_half_positions 
half elements the same, and half + 1 elements the same  1.276 s WRONG ANSWER 
got 19, but element is not a dominator, value 2 has only 10 occurences (n=20)



// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

    Stack<Integer> stack = new Stack<Integer>();

    for (int i =0; i < A.length; i++)
    {
        if (stack.empty())
            stack.push(new Integer(A[i]));
        else
        {
            int topElem = stack.peek().intValue();
            if (topElem == A[i])
            {
                stack.push(new Integer(A[i]));
            }
            else
            {
                stack.pop();
            }
        }            
    }

    if (stack.empty())
        return -1;

    int elem = stack.peek().intValue();
    int count = 0;
    int index = 0;
    for (int i = 0; i < A.length; i++)
    {
        if (elem == A[i])
        {
            count++;
            index = i;
        }
    }

    if (count > ((double)A.length/2.0))
        return index;
    else
        return -1;
}
}

