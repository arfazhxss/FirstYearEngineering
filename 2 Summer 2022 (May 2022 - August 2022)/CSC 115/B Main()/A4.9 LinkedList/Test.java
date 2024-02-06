public class Test {
    public static void main (String[] args) {

        // Q1a. create a new blank node n1
        Node n1 = new Node();

        // Q1b. create a new node n2 with a value of 9
        Node n2 = new Node(9);


        // Q1c. print the values in n1 and n2
        System.out.println("n1 " + n1.getValue());
        System.out.println("n2 " + n2.getValue());

        // Q2a. connect n1 to n2 such that n2 is before n1
        n2.next = n1;

        // Q2b. print the value in n1 and n2 without using the variable n1
        System.out.println("n1 " + n2.next.getValue());
        System.out.println("n2 " + n2.getValue());

        // Q3a. create a new node n3 with a value of 20
        Node n3 = new Node(20);

        // Q3b. assign n3 to n1
        n1 = n3;

        // Q3c. Can you still print the values in all 3 nodes?
        System.out.println("1 " + n2.next.getValue());
        System.out.println("2 " + n2.getValue());
        System.out.println("3 " + n3.getValue());
        System.out.println("4 " + n1.getValue());
        // Q4a. connect n3 to the other two nodes such that n3 is
        //      in between the other two

        n3.next = n2.next;
        n2.next = n3;


        // Q4b. print all 3 values using only the n2 variable.
        //      That is, you cannot use the variables n1 or n3
        System.out.println("1 9: " +  n2.getValue());
        System.out.println("2 20: " +  n2.next.getValue());
        System.out.println("3 0: " +  n2.next.next.getValue());

    }
}
