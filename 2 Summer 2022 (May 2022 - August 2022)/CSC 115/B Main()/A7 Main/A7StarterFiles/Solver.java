import java.util.List;
import java.util.LinkedList;
// import java.util.Arrays;
import java.util.*;

/**
 * Solver.java
 *
 * Static method to solve reordering of train cars using a Stack
 *
 */
public class Solver {
    public static int getHighest (List<Integer> stackYard) {
        int maxval = 0;
        for (int element: stackYard) {
            if (element>maxval) {
                maxval = element;
            }
        }
        return maxval;
    }

    public static boolean doMatch (Stack<Integer> stackCheck, int statCheck, int limit) {
        try {
            Stack<Integer> tempStack = new StackRefBased<Integer>();
            while (statCheck<=limit) {
                if (stackCheck.peek()!=statCheck) {
                    return false;
                }
                tempStack.push(stackCheck.pop());
                ++statCheck;
            }
            while (tempStack.size()>0) {
                stackCheck.push(tempStack.pop());
            }
        } catch (StackEmptyException see) {
            System.out.println("StackEmptyException caught in doMatch()");
        }
        return true;
    }
    public static void stackToStack (Stack<Integer> stackOne, Stack<Integer> stackTwo) {
        try {
                stackTwo.push(stackOne.pop());
        } catch (StackEmptyException see) {
            System.out.println("StackEmptyException caught in stackToStack()");
        }
    }
    public static boolean findDuplicate (Stack<Integer> statCheck, int stackSize) {
        try {
            int[] newArr = new int[statCheck.size()];
            Stack<Integer> tempStack = new StackRefBased<Integer>();
            for (int i=0; i<stackSize; i++) {
                newArr[i]=statCheck.peek();
                // System.out.println(stackSize);
                tempStack.push(statCheck.pop());
            } 
            while (tempStack.size()>0) {
                statCheck.push(tempStack.pop());
            }
            // System.out.println(Arrays.toString(newArr));
            for (int i=0; i<newArr.length; i++) {
                for (int j=0; j<newArr.length; j++) {
                    if ((i!=j)&&(newArr[i]==newArr[j])) {
                        return true;
                    }
                }
            } return false;
        } catch (StackEmptyException see) {
            System.out.println("StackEmptyException in findDuplicate");
        } return false;
    }

    public static boolean reorderTrains(List<Integer> carOrder, List<CarMove> moves) {
        try {
            if ((carOrder==null)||(moves==null)) return false;
            int curval = getHighest(carOrder);
            Stack<Integer> inputYardStack = new StackRefBased<Integer>();
            for (int i=0; i<carOrder.size();i++) {
                inputYardStack.push(carOrder.get(i));
            }
            if (inputYardStack.size()!=curval) {
                return false;
            } else if (findDuplicate(inputYardStack, curval)) {
                return false;
            }
            // System.out.println("Stack<Integer> inputYardStack{inside}:\t"+inputYardStack.toString()+" ");

            Stack<Integer> outputYardStack = new StackRefBased<Integer>();
            Stack<Integer> spurYardStack = new StackRefBased<Integer>();
            CarMove inSpur = new CarMove("in", "spur");
            CarMove inOut = new CarMove("in", "out");
            CarMove SpurOut = new CarMove("spur", "out");
            while (!(inputYardStack.isEmpty())) {
                if ((inputYardStack.peek()!=curval)&&(outputYardStack.isEmpty())) {
                    // System.out.println("curval 1:\t\t"+curval);
                    stackToStack(inputYardStack, spurYardStack);
                    moves.add(inSpur);
                } else if (inputYardStack.peek()==curval) {
                    // System.out.println("curval 2:\t\t"+curval);
                    stackToStack(inputYardStack, outputYardStack);
                    moves.add(inOut);
                    --curval;
                } else if ((spurYardStack.peek()==curval)&&(!(spurYardStack.isEmpty()))) {
                    // System.out.println("curval 3:\t\t"+curval);
                    stackToStack(spurYardStack, outputYardStack);
                    moves.add(SpurOut);
                    // System.out.println("curval 4:\t\t"+curval);
                    --curval;
                } else if ((inputYardStack.peek()!=curval)&&(outputYardStack.peek()!=curval)&&(!(outputYardStack.isEmpty()))) {
                    stackToStack(inputYardStack, spurYardStack);
                    moves.add(inSpur);
                } else return false;
            }
            while ((!(spurYardStack.isEmpty()))&&(curval>0)) {
                // System.out.println("curval 5:\t\t"+curval);
                stackToStack(spurYardStack, outputYardStack);
                moves.add(SpurOut);
                // System.out.println("curval 6:\t\t"+curval);
                --curval;
            }


            // System.out.println("input check:\t"+inputYardStack.toString());
            // System.out.println("spur check:\t"+spurYardStack.toString());
            // System.out.println("output check 1:\t"+outputYardStack.toString());

            // System.out.println("List<CarMove> result{Inside}:\t\t"+moves.toString());
            if (doMatch(outputYardStack, 1, getHighest(carOrder))) {
                return true;
            } else {
                moves.clear();
            }
            return false;



        } catch (StackEmptyException see) {
            System.out.println("StackEmptyException caught in reorderTrains()");
        }
        return true;
    }


    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE
    // // // DO NOT CROSS THIS LINE

    // public static void addIntegers(List<Integer> list, int[] array) {
    //     for(int val: array)
    //         list.add(val);
    // }
    // public static void main (String[] args) {
    //     int[] railway0 = {1,2,3,4,5,6};	//true
    //     int[] railway1 = {7,6,5,4,3,2,1};	//true
    //     int[] railway2 = {1,3,5,4,2};	//true
    //     int[] railway3 = {4,3,5,1,2};	//false  - cannot do with only one spur
    //     int[] railway4 = {1,4,4,2,3}; 	//false  - duplicate entry
    //     int[] railway5 = {1,5,2,3,6};	//false	 - wrong entry
    //     int[] railway6 = {5,4,7,8,6,3,2,1};  //true  - can do with one spur
    //     int[] railway7 = {6,5,4,3,2};	//false - highest number > number of cars
    //     int[] railway8 = {5,4,3,2,1};
    //     int[] railway10 = {};


    //     // arrays containing CarMove pairs.
    //     String expected0[] = {"in","out","in","out","in","out","in","out","in","out","in","out"};
    //     String expected1[] = {"in","spur","in","spur","in","spur","in","spur","in","spur","in","spur",
    //             "in","out","spur","out","spur","out","spur","out","spur","out","spur","out","spur","out"};
    //     String expected2[] = {"in","spur","in","spur","in","out","spur","out",
    //                          "in","out","spur","out","in","out"};
    //     String expected6[] = {"in","spur","in","spur","in","spur","in","spur",
    //             "in","out","in","out","spur","out","in","spur","in","out",
    //             "spur","out","spur","out","spur","out","spur","out"};

    //     List<Integer> cars = new LinkedList<Integer>();
    //     List<CarMove> resultList = new LinkedList<CarMove>();   
    //     // cars == railwayX  
    //     // railwayX is array; cars is LinkedList   
    //     addIntegers(cars, railway10);

    //     // cars is LinkedList<Integer>
    //     // resultList is LinkedList<carMove>
    //     System.out.println("Actual:\t\t\t\t\t"+Solver.reorderTrains(cars, resultList));
    //     // System.out.println("List<carMove> result{Outside}:\t\t"+resultList);
        
    // }
}
