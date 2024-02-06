/*
 * Lab7Part1Tester.java
 */
public class Lab7Part1Tester {

    private static int testPassCount = 0;
    private static int testCount = 0;

    public static void main (String[] args) {

        try {
            testBasicStack();
            testStackExceptions();
            testStackUseFunctions();
        } catch (Exception e) {
            System.out.println("Your code threw an Exception.");
            System.out.println("Perhaps a stack trace will help:");
            e.printStackTrace(System.out);
        }
        System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
    }


    /*
     * Purpose: determines whether every '(' bracket
     *  in str is matched with a ')'
     * Parameters: String str - the String check
     * Returns: boolean - true if brackets are matched, false otherwise
     */
    public static boolean doBracketsMatch(String str) {
        try {
            Stack stk = new StackArrayBased();
            char c = ' ';
            char popped = ' ';
            for(int i=0; i<str.length(); i++) {
                c = str.charAt(i);
                if (c == '(') {
                    stk.push(c);
                } else if (c == ')') {
                    if (stk.isEmpty())
                        return false;
                    else
                        popped = stk.pop();
                }
            }
            displayResults(true, "exception thrown when it should be");
            return stk.isEmpty();
        } catch (StackEmptyException see) {
            displayResults(false, "exception thrown when it shouldn't be");
        }
        return true;
    }

    public static void testBasicStack() {
        System.out.println("testBasicStack: start");

        Stack s;
        int subtestSize;
        boolean subtestResult;

        s = new StackArrayBased();
        displayResults(s.isEmpty(), "isEmpty on empty stack");
        displayResults(s.size() == 0, "size on empty stack");

        s = new StackArrayBased();
        s.push('a');
        displayResults(!s.isEmpty(), "isEmpty - stack with one element");
        displayResults(s.size() == 1, "size - stack with one element");


        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(!s.isEmpty(), "isEmpty - stack with multiple elements");
        displayResults(s.size() == subtestSize, "size - stack with multiple elements");
        try {
            subtestResult = true;
            for (int i = subtestSize - 1; i >= 0; i--) {
                char ii = s.pop();
                subtestResult = subtestResult && (ii == (char)(i+'0'));
            }
            displayResults(subtestResult, "pop - stack with multiple elements");
            displayResults(s.isEmpty(), "isEmpty - after pop");
            displayResults(s.size() == 0, "size - after pop");
        }
        catch (StackEmptyException see) {
            displayResults(false, "exception thrown when it shouldn't be");
        }


        s = new StackArrayBased();
        s.push('b');
        try {
            s.peek();
            displayResults(true, "exception not thrown when it shouldn't be");
        }
        catch (StackEmptyException see) {
            displayResults(false, "exception thrown when it shouldn't be");
        }
        displayResults( !s.isEmpty(), "push/peek + isEmpty - stack with one elements");
        displayResults(s.size() == 1, "push/peek + size - stack with one elements");


        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(!s.isEmpty(), "push + isEmpty");
        displayResults(s.size() == subtestSize, "push + size");
        subtestResult = true;
        try {
            for (int i = subtestSize - 1; i >= 0; i--) {
                char ii = s.peek();
                subtestResult = subtestResult && (ii == (char)((subtestSize - 1) + '0'));
            }
            displayResults(subtestResult, "push + peek");
            displayResults(!s.isEmpty(), "push + peek + isEmpty");
            displayResults(s.size() == subtestSize, "push + peek + size");
        }
        catch (StackEmptyException see) {
            displayResults(false, "exception thrown when it shouldn't be");
        }

        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        displayResults( s.isEmpty(), "makeEmpty + isEmpty - stack with multiple elements");

        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(!s.isEmpty(), "makeEmpty + push + isEmpty - stack with multiple elements");
        displayResults(s.size() == subtestSize, "makeEmpty + push + size - stack with multiple elements");


        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }

        try {
            displayResults(s.peek() == (char)((subtestSize - 1) + '0'), "makeEmpty + push + peek - stack with multiple elements");
            s.pop();
            displayResults(s.peek() == (char)((subtestSize - 2) + '0'), "makeEmpty + push + pop + peek - stack with multiple elements");
        }
        catch (StackEmptyException see) {
            displayResults(false, "exception thrown when it shouldn't be");
        }
        
        System.out.println("testing Stack: end");
        System.out.println();
    }

    public static void testStackExceptions() {
        
        System.out.println("testing Stack Exceptions: start");

        Stack s;

        // s = new StackArrayBased();
        // s.pop();

        try {
            s = new StackArrayBased();
            s.pop();
            displayResults(false, "exception not thrown when it should be");
        } catch (StackEmptyException see) {
            displayResults(true, "exception thrown when it should be");
        }

        try {
            s = new StackArrayBased();
            s.peek();
            displayResults(false, "exception not thrown when it should be");
        } catch (StackEmptyException see) {
            displayResults(true, "exception thrown when it should be");
        }

        try {
            s = new StackArrayBased();
            s.push('a');
            s.push('b');
            s.push('c');
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            displayResults(false, "exception not thrown when it should be");
        } catch (StackEmptyException see) {
            displayResults(true, "exception thrown when it should be");
        }
        
        try {
            s = new StackArrayBased();
            s.push('a');
            s.push('b');
            s.push('c');
            s.makeEmpty();
            s.peek();
            displayResults(false, "exception not thrown when it should be");
        } catch (StackEmptyException see) {
            displayResults(true, "exception thrown when it should be");
        }

        System.out.println("testing Stack Exceptions: end");
        System.out.println();
    }



    public static void testStackUseFunctions() {
        System.out.println("testing StackUseFunctions: start");

        boolean matched;
        matched = doBracketsMatch("");
        displayResults(matched, "doBracketsMatch empty String");

        matched = doBracketsMatch("(abc)");
        displayResults(matched, "doBracketsMatch \"(abc)\"");

        matched = doBracketsMatch(")abc(");
        displayResults(!matched, "doBracketsMatch \")abc(\"");

        matched = doBracketsMatch("(a(bc))");
            displayResults(matched, "doBracketsMatch \"(a(bc))\"");

        matched = doBracketsMatch("(lm(def)))");
        displayResults(!matched, "doBracketsMatch \"(lm(def)))\"");

        matched = doBracketsMatch("k(lmn)ab)");
        displayResults(!matched, "doBracketsMatch \"k(lmn)ab)\"");

        matched = doBracketsMatch("k(lmn)ab)");
        displayResults(!matched, "doBracketsMatch \"(k(l(mn)ab)\"");

        System.out.println("testing StackUseFunctions: end");
        System.out.println();

    }



    public static void displayResults (boolean passed, String testName) {
        /* There is some magic going on here getting the line number
         * Borrowed from:
         * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
         */
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testCount);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }


}
