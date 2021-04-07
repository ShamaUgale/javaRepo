public static String solution(String str, int key){
    String s = "";
    int len = str.length();
    for(int x = 0; x < len; x++){
        char c = (char)(str.charAt(x) + key);
        if (c > 'z')
            s += (char)(str.charAt(x) - (26-key));
        else
            s += (char)(str.charAt(x) + key);
    }
    return s;
}
