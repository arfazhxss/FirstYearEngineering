public class ListTester {

    public static void main (String[] args) {

        // Q5. update this code so that it will test IntegerLinkedList
        // Compile and run this tester
        // go to IntegerLinkedList and implement each incomplete method
        IntegerList myList;
        String type = "linkedlist";

        if (type.equals("arraylist")) {
            myList= new IntegerArrayList();
        } else {
            myList= new IntegerLinkedList();
        }

        System.out.println("empty list: " + myList);
        System.out.println("0: " + myList.size());

        // myList.addFront(5);
        // System.out.println("5: " + myList);
        // System.out.println("1: " + myList.size());
        //
        // myList.addFront(6);
        // System.out.println("6 5: " + myList);
        // System.out.println("2: " + myList.size());

        myList.addBack(8);
        System.out.println("8: " + myList);
        System.out.println("1: " + myList.size());

        myList.addBack(6);
        System.out.println("8 6: " + myList);
        System.out.println("2: " + myList.size());

        // myList.addBack(7);
        // System.out.println("5 6 7: " + myList);
        // System.out.println("3: " + myList.size());
        //
        // myList.addFront(10);
        // System.out.println("10 5 6 7: " + myList);
        // System.out.println("4: " + myList.size());
        //
        // myList.addFront(11);
        // System.out.println("11 10 5 6 7: " + myList);
        // System.out.println("5: " + myList.size());
        //
        // int val = myList.get(0);
        // System.out.println("11: " + val);
        //
        // val = myList.get(4);
        // System.out.println("7: " + val);
        //
        // val = myList.get(2);
        // System.out.println("5: " + val);

    }
}
