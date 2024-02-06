/*
 * Lab9Tester.java
 */
public class Lab9Tester {

    private static int testPassCount = 0;
    private static int testCount = 0;

    public static void main (String[] args) {

        try {
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            testBSTHeight(new ArrayBasedBinarySearchTree());
            //
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTInsert(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            testBSTHeight(new RefBasedBinarySearchTree());
            //
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new ArrayBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new RefBasedBinaryTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new ArrayBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            testSum(new RefBasedBinarySearchTree());
            // 
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new ArrayBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new RefBasedBinaryTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new ArrayBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());
            testContains(new RefBasedBinarySearchTree());

        } catch (Exception e) {
            System.out.println("Your code threw an Exception.");
            System.out.println("Perhaps a stack trace will help:");
            e.printStackTrace(System.out);
        }
        System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
    }

    public static void testBSTInsert(BinaryTree bt) {
        System.out.println("testBSTInsert: start");

        // tested comparing expected inOrder traversal returned by toString
        String expected = "";
        displayResults(bt.toString().equals(expected), "empty tree");

        bt.insert(5);
        expected = "5 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");

        bt.insert(10);
        expected = "5 10 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");
        // System.out.println("\n\n\nTEST1 [ "+bt.toString()+" ], Expected: [ "+expected+" ]\n\n\n");

        bt.insert(3);
        expected = "3 5 10 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");
        // System.out.println("\n\n\nTEST1 [ "+bt.toString()+" ], Expected: [ "+expected+" ]\n\n\n");

        bt.insert(8);
        bt.insert(12);
        expected = "3 5 8 10 12 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");
        // System.out.println("\n\n\nTEST1 [ "+bt.toString()+" ], Expected: [ "+expected+" ]\n\n\n");

        bt.insert(1);
        bt.insert(4);
        expected = "1 3 4 5 8 10 12 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");
        // System.out.println("\n\n\nTEST1 [ "+bt.toString()+" ], Expected: [ "+expected+" ]\n\n\n");

        bt.insert(10);
        bt.insert(4);
        expected = "1 3 4 5 8 10 12 ";
        displayResults(bt.toString().equals(expected), "insert duplicates, should replace");
        // System.out.println("\n\n\nTEST1 [ "+bt.toString()+" ], Expected: [ "+expected+" ]\n\n\n");

        int[] values1 = {11, 8, 1, 9, 2, 0, 16, 6, 14, 7};
        for (int val: values1) {
            bt.insert(val);
        }

        expected = "0 1 2 3 4 5 6 7 8 9 10 11 12 14 16 ";
        displayResults(bt.toString().equals(expected), "non-empty tree");

        System.out.println("testBSTInsert: end");
        System.out.println();
    }

    // only for testing BST height, not BT height
    public static void testBSTHeight(BinaryTree bt) {
        System.out.println("testBSTHeight: start");


        int expected = 0;
        displayResults(bt.height() == expected, "empty tree");

        bt.insert(5);
        expected = 1;
        displayResults(bt.height() == expected, "non-empty tree");

        bt.insert(10);
        expected = 2;
        displayResults(bt.height() == expected, "non-empty tree");
        

        bt.insert(3);
        expected = 2;
        displayResults(bt.height() == expected, "non-empty tree");
        bt.insert(8);
        bt.insert(12);
        expected = 3;
        displayResults(bt.height() == expected, "non-empty tree");

        bt.insert(1);
        bt.insert(4);
        expected = 3;
        displayResults(bt.height() == expected, "non-empty tree");

        bt.insert(10);
        bt.insert(4);
        expected = 3;
        displayResults(bt.height() == expected, "insert duplicates, should replace");

        int[] values1 = {11, 8, 1, 9, 2, 0, 16, 6, 14, 7};
        for (int val: values1) {
            bt.insert(val);
        }

        expected = 5;
        displayResults(bt.height() == expected, "non-empty tree");

        System.out.println("testBSTHeight: end");
        System.out.println();
    }

    public static void testSum(BinaryTree bt) {
        System.out.println("testSum: start");

        Integer expected = 0;
        displayResults(bt.sum().equals(expected), "empty tree");

        bt.insert(5);
        expected = 5;
        displayResults(bt.sum().equals(expected), "non-empty tree");

        bt.insert(10);
        expected = 15;
        displayResults(bt.sum().equals(expected), "non-empty tree");
        // System.out.println("\t\tTEST: sum(): "+bt.sum()+" Expected "+expected+" String:[ "+bt.toString()+" ]");
        bt.insert(3);
        expected = 18;
        displayResults(bt.sum().equals(expected), "non-empty tree");

        bt.insert(8);
        bt.insert(12);
        expected = 38;
        displayResults(bt.sum().equals(expected), "non-empty tree");
        // System.out.println("\t\tTEST: sum(): "+bt.sum()+" Expected "+expected+" String:[ "+bt.toString()+" ]");


        bt.insert(1);
        bt.insert(4);
        expected = 43;
        displayResults(bt.sum().equals(expected), "non-empty tree");
        int[] values1 = {11, 9, 2, 0, 16, 6, 14, 7};
        for (int val: values1) {
            bt.insert(val);
        }

        expected = 108;
        displayResults(bt.sum().equals(expected), "non-empty tree");

        System.out.println("testSum: end");
        System.out.println();
    }
    public static void testContains(BinaryTree bt) {
        System.out.println("testContains: start");


        displayResults(bt.contains(5)==false, "empty tree");

        bt.insert(5);
        displayResults(bt.contains(5)==true, "non-empty tree");
        displayResults(bt.contains(2)==false, "non-empty tree");
        displayResults(bt.contains(8)==false, "non-empty tree");

        bt.insert(10);
        // System.out.print("TEST Contains 10:\t"+bt.contains(10)+"\n[ "+bt.toString()+" ]");
        displayResults(bt.contains(10)==true, "non-empty tree");
        displayResults(bt.contains(6)==false, "non-empty tree");

        bt.insert(3);
        displayResults(bt.contains(3)==true, "non-empty tree");
        displayResults(bt.contains(2)==false, "non-empty tree");

        bt.insert(8);
        bt.insert(12);
        bt.insert(1);
        bt.insert(4);
        displayResults(bt.contains(8)==true, "non-empty tree");
        displayResults(bt.contains(12)==true, "non-empty tree");
        displayResults(bt.contains(1)==true, "non-empty tree");
        displayResults(bt.contains(4)==true, "non-empty tree");
        displayResults(bt.contains(2)==false, "non-empty tree");

        int[] values1 = {11, 9, 2, 0, 16, 6, 14, 7};
        for (int val: values1) {
            bt.insert(val);
        }

        displayResults(bt.contains(16)==true, "non-empty tree");
        displayResults(bt.contains(14)==true, "non-empty tree");
        // System.out.print("TEST Contains 14:\t"+bt.contains(14)+"\n[ "+bt.toString()+" ]");
        displayResults(bt.contains(0)==true, "non-empty tree");
        displayResults(bt.contains(4)==true, "non-empty tree");
        // System.out.print("TEST Contains:\t"+bt.contains(4)+"\n[ "+bt.toString()+" ]");
        displayResults(bt.contains(-1)==false, "non-empty tree");
        displayResults(bt.contains(18)==false, "non-empty tree");
        displayResults(bt.contains(13)==false, "non-empty tree");

        System.out.println("testContains: end");
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
