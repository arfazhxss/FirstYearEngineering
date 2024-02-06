import java.io.*;
import java.util.*;

public class A3_Tester {

    static boolean arrEq (int[] arr1, int[] arr2, int i) {
		if(i == arr1.length) {return true;}
		if(arr1[i] != arr2[i]) {return false;}
		return arrEq(arr1, arr2, ++i);
	}

	static boolean isWeirdEqual (int[] a, int[] b) {
		int arLen = (a.length);
		int arLen2 = (int)(arLen/2);
		if (arLen%2!=0) {
			if (arrEq(a, b, 0)) {return true;}
			else return false;
		} else {		
			if (arrEq(a, b, 0)) {return true;}
				else {
					// System.out.println(">>>\tisWeirdEqual checking between "+Arrays.toString(a)+" and "+Arrays.toString(b));
					int[] a1 = Arrays.copyOfRange(a, 0, arLen2);
					int[] a2 = Arrays.copyOfRange(a, arLen2, arLen);
					int[] b1 = Arrays.copyOfRange(b, 0, arLen2);
					int[] b2 = Arrays.copyOfRange(b, arLen2, arLen);
					if ((isWeirdEqual(a1, b1))&&(isWeirdEqual(a2, b2))) {
						// System.out.println(">>>\t\tinP1 matched");
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a2));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b2));
						return true;}
					else if ((isWeirdEqual(a1, b1))&&(isWeirdEqual(a1, b2))) {
						// System.out.println(">>>\t\tinP2 matched");
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a2));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b2));
						return true;}
					else if ((isWeirdEqual(a2, b2))&&(isWeirdEqual(a2, b1))) {
						// System.out.println(">>>\t\tinP3 matched");
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(a2));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b1));
						// System.out.println(">>>\t\t\ta1:"+Arrays.toString(b2));
						return true;}
					else return false;
				}
			}
	}


    public static void test_all_cases() {
        int i;
        int total_tests = 13;
        int passed_tests = 0;

        System.out.println("======= Assignment 3 - Test Cases =======");

        for (i = 0; i <= total_tests; i++) {
            try {
                // Test files input00.txt to input13.txt
                String inputFileName = "input" + String.format("%02d", i) + ".txt"; 
                String outputFileName = "output" + String.format("%02d", i) + ".txt";
                String file = "TestCases/input/" + inputFileName;
                boolean result = readFile(file);

                file = "TestCases/output/" + outputFileName;

                Scanner in = new Scanner(new File(file));
                String expected = in.nextLine();
                in.close();

                String actual = result ? "YES" : "NO";

                if (expected.equals(actual)) {
                    System.out.println("Test " + String.format("%02d", i) + ": PASS");
                    passed_tests++;
                } else {
                    System.out.println("Test " + String.format("%02d", i) + ": FAIL! \t**\t **");
                    System.out.println("\tExpected: [" + expected + "]");
                    System.out.println("\tActual:   [" + actual + "]");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }

        System.out.println("========================================");
        System.out.println("Test Results: " + (passed_tests - 1) + "/" + total_tests + " tests passed.");
    }

    private static boolean readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int j = 0; j < n; j++){
            a[j] = in.nextInt();
        }
        
        for(int j = 0; j < n; j++){
            b[j] = in.nextInt();
        }
        
        in.close();
        return isWeirdEqual(a, b);

    }
    
    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        test_all_cases();
    }
}