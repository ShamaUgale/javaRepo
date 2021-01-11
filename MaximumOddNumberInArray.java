/*
Java Program to Find Maximum Odd Number in Array 
Using Stream and Filter*/

class Test { 
      
    public static int maxOdd(List<Integer> list) 
    { 
        Iterator<Integer> it = list.iterator(); 
  
        int max = 0; 
        while (it.hasNext()) { 
            int num = it.next(); 
  
            if (num % 2 == 1) { 
                if (num > max) { 
                    max = num; 
                } 
            } 
        } 
  
        return max; 
    } 
      
    public static void main(String[] args) 
    { 

 int[] arr = { 2, 1, 5, 3 }; 
        List<Integer> list = Array.asList(arr);  
        System.out.println("Largest odd number: "
                           + maxOdd(list)); 
    } 
}