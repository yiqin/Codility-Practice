A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.
Write a function:
int solution(string &S);
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
Assume that:
N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int isNested = 1;
        char[] charArray = S.toCharArray();
        char[] stack = new char[charArray.length];
        int stackCurrentPosition = 0;
        
        for (int i=0; i<charArray.length; i++) {
            if(i==0) {
                stack[0] = charArray[i];
            }
            else {
                if (charArray[i]=='}') {
                    if (stack[stackCurrentPosition]!='{') {
                        isNested = 0;
                        break;
                    }
                    else {
                        stack[stackCurrentPosition] = 'a';
                        stackCurrentPosition--;
                    }
                }
                else if (charArray[i]==']') {
                    if (stack[stackCurrentPosition]!='[') {
                        isNested = 0;
                        break;
                    }
                    else {
                        stack[stackCurrentPosition] = 'a';
                        stackCurrentPosition--;
                    }                    
                }
                else if (charArray[i]==')') {
                    if (stack[stackCurrentPosition]!='(') {
                        isNested = 0;
                        break;
                    }
                    else {
                        stack[stackCurrentPosition] = 'a';
                        stackCurrentPosition--;
                    }
                }
                else {
                    // System.out.println(i+":"+charArray[i]);
                    stack[stackCurrentPosition+1] = charArray[i];
                    stackCurrentPosition++;
                }
            }
            
        }
        
        
        return isNested;
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.LinkedList;
class Solution {
     public int solution(String S) {
         LinkedList<Character> stack = new LinkedList<Character>();
         
         for(int i=0;i<S.length();i++) {
             char c = S.charAt(i);
             
             if(c == '{' || c == '[' || c == '(') {
                 stack.push(c);
             } else {
                 if(stack.isEmpty()) {
                     return 0;
                 }
                 
                 char corresponding = stack.pop();
                 
                 if(c == ')' && corresponding != '(') {
                     return 0;
                 }
                 
                 if(c == ']' && corresponding != '[') {
                     return 0;
                 }
 
                 if(c == '}' && corresponding != '{') {
                     return 0;
                 }
 
             }
         }
         
         return stack.isEmpty() ? 1 : 0;
     }
 }

