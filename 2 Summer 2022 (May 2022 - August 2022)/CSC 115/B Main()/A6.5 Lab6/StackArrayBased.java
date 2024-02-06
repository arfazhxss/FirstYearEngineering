public class StackArrayBased implements Stack {
    private static final int INIT_SZ = 4;
    private char[] data;
    private int top;
    // NOTICE:  there is no count
    //  think about why you do not need a count...
    //  Since you are keeping track of the index of top,
    //  what does this tell you about the count?


    public StackArrayBased() {
        data = new char[INIT_SZ];
        top = -1;
    }

    public int size() {
        return (top+1);
    }

    public boolean isEmpty() {
        if (top==(-1)) {
            return true;
        } else return false;
    }

    public void push(char val) {
        if (top==(data.length-1)) {
            expandAndCopy();
        } 
        data[++top]=val;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("SizeErrorCheck");
            return 'z';
        } 
        return data[top--];
    }


    public char peek() {
        if (isEmpty()) {
            System.out.println("SizeErrorCheck");
            return 'z'; 
        }
        return data[top];
    }

    public void makeEmpty() {
        top=-1;
    }

    public String toString() {
        String result = "{";
        String separator = "";

        for (int i=top; i>=0; i--) {
            result += separator + data[i];
            separator = ", ";
        }

        result += "}";
        return result;
    }

    /*
     * Purpose:
     *   creates a new array twice the size of data,
     *   copies all values from data to new array and
     *   assigns data to refer to the new array
     *
     * Parameters:
     *   none
     *
     * Returns:
     *   nothing
     */
    private void expandAndCopy() {
        char[] newData = new char[data.length*2];
        for(int i=0; i<data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    // public static String reverseString(String str) {
    //     Stack stk = new StackArrayBased();
    //     String result = "";
    //     for(int i=0; i<str.length(); i++) {
    //     stk.push(str.charAt(i));
    //     }
    //     while (!stk.isEmpty()) {
    //     result +=stk.pop();
    //     }
    //     return result;
    //     }

    // public static void main (String[] args) {
    //     // Stack s;
    //     // s = new StackArrayBased();
    //     // s.push('f');
    //     // s.push('e');
    //     // s.push('d');
    //     // s.push('c');
    //     // s.push('b');
    //     // s.push('a');
    //     // s.pop();
    //     // s.pop();
    //     // s.pop();
    //     // s.pop();
    //     // s.pop();
    //     // s.pop();
    //     // s.pop();
    //     // s.makeEmpty();
    //     // System.out.println("StackArr: "+s.toString());
    //     // System.out.println("size? "+s.size());
    //     // System.out.println("Peek? "+s.peek());
    //     // System.out.println("isEmpty? "+s.isEmpty());
    //     System.out.println(reverseString("ABCDE FGHIJKLM NOP"));
    //     return;
    // }
}
