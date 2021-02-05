import java.io.*; 
import java.util.*; 
  
class Test { 
  
static void reverseWords(String str) 
{ 
    Stack<Character> st=new Stack<Character>(); 
   
    for (int i = 0; i < str.length(); ++i) { 
        if (str.charAt(i) != ' ') 
            st.push(str.charAt(i)); 
   
        else { 
            while (st.empty() == false) { 
                System.out.print(st.pop()); 
                  
            } 
            System.out.print(" "); 
        } 
    } 
   
    while (st.empty() == false) { 
        System.out.print(st.pop()); 
          
    } 
} 
  
// Driver program to test above function 
public static void main(String[] args) 
{ 
   String str = "Geeks for Geeks"; 
    reverseWords(str); 
  } 
} 
