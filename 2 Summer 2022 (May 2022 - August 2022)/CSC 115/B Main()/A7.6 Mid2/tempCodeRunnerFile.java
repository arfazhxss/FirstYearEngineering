    public static void main (String[] args) {
    
        IntegerLinkedList list1 = new IntegerLinkedList();
        list1.addBack(0);
        list1.addBack(2);
        list1.addBack(1);
        list1.addBack(2);
        list1.addBack(1);
        list1.addBack(1);
        list1.addBack(4);
        list1.addBack(5);
        list1.addBack(2);
        list1.addBack(5);
        list1.addBack(4);
        list1.addBack(4);
        list1.addBack(2);
        list1.addBack(5);
        list1.addBack(4);
        list1.addBack(5);
        list1.addBack(2);
        list1.addBack(2);
        list1.addBack(5);
        list1.addBack(4);
        list1.addBack(2);
        list1.addBack(5);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(1);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(0);
        // list1.removeAtPosition(0);
        // list1.removeValue(0);
        list1.removeValue(5);
        list1.removeValue(1);
        // list1.removeValue(23);
        // list1.removeValue(7);

        System.out.println("\n\n\nTestList1\nStartsHere");
        System.out.println("\nCount:"+list1.size()+"\t\tList:\t"+Arrays.toString(list1.printAll()));
        // System.out.println("Reverse:\t"+list1.reverse());

        // IntegerLinkedList list2 = new IntegerLinkedList();
        // list2.addBack(11);
        // list2.addBack(23);
        // list2.addFront(15);
        // list2.addFront(14);
        // list2.addBack(12);
        // // list2.addBack(111);
        
        // System.out.println("\nTestList2\nStartsHere");
        // System.out.println("Count:"+list2.size()+"\nList:"+Arrays.toString(list2.printAll()));
        // System.out.println(list2.reverse());
    }