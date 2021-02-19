public class HelloWorld{

     public static void main(String []args){
         String s = "This is a sample string23";
         int len =0;
         
         for(int i =0; i<s.length();i++){
             if(s.charAt(i)== ' '){
                 len =0;
             }else{
                 len ++;
             }
         }
         System.out.println("The length of last word is : " + len);
     }
}
