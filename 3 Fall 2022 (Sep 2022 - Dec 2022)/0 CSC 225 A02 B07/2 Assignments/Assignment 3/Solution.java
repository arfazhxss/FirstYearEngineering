import java.io.*;
import java.util.*;

public class Solution {
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
    
    public static void main(String[] args) {
	// Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
	// You should be able to compile your program with the command:
	// 	javac Solution.java
   	// To conveniently test your algorithm, you can run your solution with any of the tester input files using:
	// 	java Solution inputXX.txt
	// where XX is 00, 01, ..., 13.

   	Scanner s;
	if (args.length > 0){
		try {
			s = new Scanner(new File(args[0]));
		} catch(java.io.FileNotFoundException e){
			System.out.printf("Unable to open %s\n",args[0]);
			return;
		}
		// System.out.printf("Reading input values from %s.\n",args[0]);
	}	else {
		s = new Scanner(System.in);
		System.out.printf("Reading input values from stdin.\n");
	}     
  
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int j = 0; j < n; j++){a[j] = s.nextInt();}
        for(int j = 0; j < n; j++){b[j] = s.nextInt();}
        
		// System.out.println("Array1: "+Arrays.toString(a)+"\nArray2: "+Arrays.toString(b)+"\n");

        System.out.println((isWeirdEqual(a, b) ? "YES" : "NO"));
    }
}
