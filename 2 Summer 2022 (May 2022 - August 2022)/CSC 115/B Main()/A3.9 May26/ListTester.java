public class ListTester {
    public static void main (String[] args) {
        // Q0. implement the constructor and the size method
        IntegerList myList = new IntegerArrayList();
        System.out.println("empty list: " + myList);
        System.out.println("0: " + myList.size());

        // Q1. implement the addBack method in IntegerArrayList
         myList.addBack(5);
         System.out.println("5: " + myList);
         System.out.println("1: " + myList.size());
        
         myList.addBack(6);
         System.out.println("5 6: " + myList);
         System.out.println("2: " + myList.size());
        
         myList.addBack(7);
         System.out.println("5 6 7: " + myList);
         System.out.println("3: " + myList.size());

        // Q2a. go to the toString method in IntegerArrayList

        // Q3. continue to implement/test your IntegerArrayList methods
        myList.addFront(2);
        System.out.println("2 5 6 7: " + myList);
        System.out.println("4: " + myList.size());

        myList.addFront(9);
        System.out.println("9 2 5 6 7: " + myList);
        System.out.println("5: " + myList.size());

        int res = myList.get(3);
        System.out.println("6: " + res);
        // Q4. What behaviours do you find ineffcient in our IntegerArrayList
        //  If we introduced OtherIntegerListType...
        //    How would the UML change?
        //    How would the tester change?
        //    What methods must this class have?
        //    What would you want those methods to look like to
        //        reduce the inefficiencies you identified?
        
        IntegerList l = new IntegerArrayList();
        l.addBack(2);
        l.addBack(3);
        l.addBack(4);

    }
}

