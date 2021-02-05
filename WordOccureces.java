public class Test {

  public static void main(String[] args){
       
        String str =“This is a test test test”;
        count_Words(String str);
    }

 public static int count_Words(String str) {
      HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length; i++) {
            String key = str[I];
            int freq = freqMap.getOrDefault(key, 0);
            freqMap.put(key, ++freq);
        }
        for (Entry<String, Integer> result : freqMap.entrySet()) {
	if(result.getValue() > 1){
            System.out.println(result.getKey() + " " + result.getValue());
    }
}
    
}
