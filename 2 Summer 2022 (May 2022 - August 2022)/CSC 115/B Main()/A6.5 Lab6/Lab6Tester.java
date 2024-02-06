/*
 * Lab6Tester.java
 */
public class Lab6Tester {
    
    private static int testPassCount = 0;
    private static int testCount = 0;
    
    public static void main (String[] args) {
        
        try {
            testBasicStack();
            testStackApplicationsFunctions();
            testQueue();
            
        } catch (Exception e) {
            
            System.out.println("Your code threw an Exception.");
            System.out.println("Perhaps a stack trace will help:");
            e.printStackTrace(System.out);
        }
        System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
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
        displayResults(s.size() == subtestSize,
                       "size - stack with multiple elements");
        
        subtestResult = true;
        for (int i = subtestSize - 1; i >= 0; i--) {
            char ii = s.pop();
            subtestResult = subtestResult && (ii == (char)(i+'0'));
        }
        displayResults(subtestResult, "pop - stack with multiple elements");
        displayResults(s.isEmpty(), "isEmpty - after pop");
        displayResults(s.size() == 0, "size - after pop");
        
        
        
        s = new StackArrayBased();
        s.push('b');
        s.peek();
        displayResults( !s.isEmpty(),
                       "push/peek + isEmpty - stack with one elements");
        displayResults(s.size() == 1,
                       "push/peek + size - stack with one elements");
        
        
        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(!s.isEmpty(), "push + isEmpty");
        displayResults(s.size() == subtestSize, "push + size");
        subtestResult = true;
        for (int i = subtestSize - 1; i >= 0; i--) {
            char ii = s.peek();
            subtestResult = (subtestResult
                             && (ii == (char)((subtestSize - 1) + '0')));
        }
        displayResults(subtestResult, "push + peek");
        displayResults(!s.isEmpty(), "push + peek + isEmpty");
        displayResults(s.size() == subtestSize, "push + peek + size");
        
        
        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        displayResults( s.isEmpty(),
                       "makeEmpty + isEmpty - stack with multiple elements");
        
        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(!s.isEmpty(),
                       "makeEmpty + push + isEmpty - stack with multiple elements");
        displayResults(s.size() == subtestSize,
                       "makeEmpty + push + size - stack with multiple elements");
        
        
        s = new StackArrayBased();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        s.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            s.push((char)(i+'0'));
        }
        displayResults(s.peek() == (char)((subtestSize - 1) + '0'),
                       "makeEmpty + push + peek - stack with multiple elements");
        s.pop();
        displayResults(s.peek() == (char)((subtestSize - 2) + '0'),
                       "makeEmpty + push + pop + peek - stack with multiple elements");
        
        System.out.println("testBasicStack: end");
        System.out.println();
    }
    
    public static void testStackApplicationsFunctions() {
        System.out.println("testStackApplicationsFunctions: start");
        
        boolean matched;
        matched = StackApplications.doBracketsMatch("");
        displayResults(matched, "doBracketsMatch empty String");
        
        matched = StackApplications.doBracketsMatch("(abc)");
        displayResults(matched, "doBracketsMatch \"(abc)\"");
        
        matched = StackApplications.doBracketsMatch(")abc(");
        displayResults(!matched, "doBracketsMatch \")abc(\"");
        
        matched = StackApplications.doBracketsMatch("(a(bc))");
        displayResults(matched, "doBracketsMatch \"(a(bc))\"");
        
        matched = StackApplications.doBracketsMatch("(lm(def)))");
        displayResults(!matched, "doBracketsMatch \"(lm(def)))\"");
        
        matched = StackApplications.doBracketsMatch("k(lmn)ab)");
        displayResults(!matched, "doBracketsMatch \"k(lmn)ab)\"");
        
        matched = StackApplications.doBracketsMatch("k((lmn)ab");
        displayResults(!matched, "doBracketsMatch \"k((lmn)ab\"");
    }
    
    public static void testQueue() {
        System.out.println("testQueue: start");
        
        Queue q;
        int subtestSize;
        boolean subtestResult;
        
        // q = new QueueRefBased();
        // q.enqueue(10);
        // displayResults(!q.isEmpty(), "isEmpty - queue with one element");
        // displayResults(q.size() == 1, "size - queue with one element");
        
        // q.isEmpty();
        
        
        
        //Testing generic queue with Integer and Character type
        
        q = new QueueRefBased<Integer>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        displayResults(!q.isEmpty(), "isEmpty - queue with multiple elements");
        displayResults(q.size() == subtestSize,
                       "size - queue with multiple elements");
        
        subtestResult = true;
        for (int i = 0; i < subtestSize; i++) {
            int ii = (int)q.dequeue();
            subtestResult = subtestResult && (ii == i);
        }
        displayResults(subtestResult, "dequeue - queue with multiple elements");
        displayResults(q.isEmpty(), "isEmpty - after dequeue");
        displayResults(q.size() == 0, "size - after dequeue");
        
        
        q = new QueueRefBased<Integer>();
        q.enqueue(10);
        q.peek();
        displayResults( !q.isEmpty(),
                       "enqueue/dequeue + isEmpty - queue with one elements");
        displayResults(q.size() == 1,
                       "enqueue/dequeue + size - queue with one elements");
        
        
        q = new QueueRefBased<Integer>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        displayResults(!q.isEmpty(), "enqueue + isEmpty");
        displayResults(q.size() == subtestSize, "enqueue + size");
        subtestResult = true;
        for (int i = 0; i<subtestSize; i++) {
            int ii = (Integer)q.peek();
            subtestResult = subtestResult && (ii == 0);
        }
        displayResults(subtestResult, "enqueue + peek");
        displayResults(!q.isEmpty(), "enqueue + peek + isEmpty");
        displayResults(q.size() == subtestSize, "enqueue + peek + size");
        
        q = new QueueRefBased<Integer>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        q.makeEmpty();
        displayResults( q.isEmpty(),
                       "makeEmpty + isEmpty - queue with multiple elements");
        
        q = new QueueRefBased<Integer>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        q.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        displayResults(!q.isEmpty(),
                       "makeEmpty + enqueue + isEmpty - queue with multiple elements");
        displayResults(q.size() == subtestSize,
                       "makeEmpty + enqueue + size - queue with multiple elements");
        
        
        q = new QueueRefBased<Integer>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        q.makeEmpty();
        for (int i = 0; i < subtestSize; i++) {
            q.enqueue(i);
        }
        displayResults((int)q.peek() == 0,
                       "makeEmpty + enqueue + peek - queue with multiple elements");
        q.dequeue();
        displayResults((int)q.peek() == 1,
                       "makeEmpty + enqueue + dequeue + peek - queue with multiple elements");
        
        
        System.out.println("testing Queue: end");
        System.out.println();
        
        //Testing generic queue with Character type
        QueueRefBased<Character> charQ;
        
        charQ = new QueueRefBased<Character>();
        subtestSize = 10;
        for (int i = 0; i < subtestSize; i++) {
            charQ.enqueue((char)(i+'0'));
        }
        
        subtestResult = true;
        for (int i = 0; i < subtestSize; i++) {
            char ii = charQ.dequeue();
            subtestResult = subtestResult && (ii == (char)(i+'0'));
        }
        displayResults(subtestResult, "dequeue - queue with multiple elements");
        
        
        System.out.println("testing Queue: end");
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
