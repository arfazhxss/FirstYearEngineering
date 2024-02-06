/*
 * Lab8Tester.java
 */
public class Lab8Tester {

    private static int testPassCount = 0;
    private static int testCount = 0;

    public static void main (String[] args) {

        try {
            testArrayBasedInsert();
            testArrayBasedHeight();
            testRefBasedHeight();
        } catch (Exception e) {
            System.out.println("Your code threw an Exception.");
            System.out.println("Perhaps a stack trace will help:");
            e.printStackTrace(System.out);
        }
        System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
    }


    public static void testArrayBasedInsert() {
        System.out.println("testArrayBasedInsert: start");

        BinaryTree bt = new ArrayBasedBinaryTree();

        String expected = "";
        displayResults(bt.toString().equals(expected), "empty tree");

        for (int i=0; i<=12; i++)
            bt.insert(i);

        expected = "7 3 8 1 9 4 10 0 11 5 12 2 6 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");

        System.out.println("testArrayBasedInsert: end");
        System.out.println();
    }

    public static void testArrayBasedHeight() {
        System.out.println("testArrayBasedHeight: start");
        int subtestStart, subtestEnd;
        boolean subtestResult;

        BinaryTree bt = new ArrayBasedBinaryTree();
        displayResults(bt.height()==0, "empty tree");

        bt.insert(2);
        displayResults(bt.height()==1, "1 node tree");

        subtestStart = 3;
        subtestEnd = 4;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==2;
        }
        displayResults(subtestResult, "nodes added to level 2");

        subtestStart = 5;
        subtestEnd = 8;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==3;
        }
        displayResults(subtestResult, "nodes added to level 3");

        subtestStart = 9;
        subtestEnd = 16;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==4;
        }
        displayResults(subtestResult, "nodes added to level 4");

        subtestStart = 17;
        subtestEnd = 32;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==5;
        }
        displayResults(subtestResult, "nodes added to level 5");

        bt.insert(33);
        displayResults(bt.height()==6, "node added to level 6");


        System.out.println("testArrayBasedHeight: end");
        System.out.println();
    }

    public static void testRefBasedHeight() {
        System.out.println("testRefBasedHeight: start");
        int subtestStart, subtestEnd;
        boolean subtestResult;

        BinaryTree bt = new RefBasedBinaryTree();
        displayResults(bt.height()==0, "empty tree");

        bt.insert(2);
        displayResults(bt.height()==1, "1 node tree");

        subtestStart = 3;
        subtestEnd = 4;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==2;
        }
        displayResults(subtestResult, "nodes added to level 2");

        subtestStart = 5;
        subtestEnd = 7;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==3;
        }
        displayResults(subtestResult, "nodes added to level 3");

        subtestStart = 8;
        subtestEnd = 12;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==4;
        }
        displayResults(subtestResult, "nodes added to level 4");

        subtestStart = 13;
        subtestEnd = 20;
        subtestResult = true;
        for(int test=subtestStart; test<=subtestEnd; test++) {
            bt.insert(test);
            subtestResult = subtestResult && bt.height()==5;
        }
        displayResults(subtestResult, "nodes added to level 5");

        bt.insert(21);
        displayResults(bt.height()==6, "node added to level 6");


        System.out.println("testRefBasedHeight: end");
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
