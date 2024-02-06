public class Test {
    public static void main (String[] args) {

        // Q1. Make LinkedList generic

        LinkedList<Integer> myList = new LinkedList<Integer>();

        System.out.println("empty: " + myList);
        myList.addFront(10);
        System.out.println("10: " + myList);
        myList.addBack(20);
        System.out.println("10 20: " + myList);
        myList.addFront(30);
        System.out.println("30 10 20: " + myList);

        int result;
        result = myList.get(2);
        System.out.println("20: " + result);

        LinkedList<String> stringList = new LinkedList<String>();
        stringList.addFront("hello");
        stringList.addFront("bye");
        stringList.addBack("so long");

        System.out.println("my new list: " + stringList);


    }
}
