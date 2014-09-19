// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

public int solution(int[] A) 
{
    ArrayList<Integer> array = new ArrayList<Integer>();  
        for (int i = 1; i < A.length - 1; i++) 
        {  
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) 
            {  
                array.add(i);  
            }  
        }  
   if (array.size() == 1 || array.size() == 0) 
   {  
        return array.size();  
   }  
   
   
    int sf = 1;  
    int ef = array.size();  
    int result = 1;  
    while (sf <= ef) 
    {  
        int flag = sf;
        
        System.out.println("flag: "+flag+" sf: "+sf+" ef: "+ef);
        
        boolean success = false;  
        int used = 0;  
        int mark = array.get(0);  
        for (int i = 0; i < array.size(); i++) 
        {  
            if (array.get(i) >= mark) 
            {  
                used++;  
                mark = array.get(i) + flag;  
                System.out.println("used: "+used);
                System.out.println("mark: "+mark);
                
                    if (used == flag) 
                    {                       
                        success = true;  
                        break;  
                    }  
            }  
        }
        
        if (success) 
        {  
            result = flag;  
            sf = flag + 1;  
        } 
        else 
        {  
            ef = flag - 1;
            System.out.println("ef is changed");
        }  
    }  
   return result;  
 }
}
