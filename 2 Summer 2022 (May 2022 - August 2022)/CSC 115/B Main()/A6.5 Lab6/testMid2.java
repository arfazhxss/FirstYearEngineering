public class testMid2 {
    public static String reverseString(String str) {
        Stack stk = new StackArrayBased();
        String result = "";
        for(int i=0; i<str.length(); i++) {
        stk.push(str.charAt(i));
        }
        while (!stk.isEmpty()) {
        result +=stk.pop();
        }
        return result;
        }
}