// import java.util.Arrays;

public class QueueRefBased<T> implements Queue<T> {

    private QueueNode<T> front;
    private QueueNode<T> back;

    public QueueRefBased() {
        this.front = null;
        back = null;
    }

    public int size() {
        int count = 0;

        QueueNode<T> tmp = this.front;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue (T element) {
        QueueNode<T> newNode = new QueueNode<T>(element);
        if (isEmpty()) {
            this.front = newNode;
            this.back = newNode;
        } else {
            this.back.setNext(newNode);
            back=newNode;
        }
    }

    public T dequeue() {
        QueueNode<T> newNode = this.front;
        T data = (T)newNode.getValue();
        this.front=newNode.getNext();
        newNode=null;
        return data;
    }

    public T peek() {
        return (T)front.getValue();
    }

    public void makeEmpty() {
        // int count = 0;

        QueueNode<T> curr = this.front;
        while (curr!=null) {
            // count++;
            this.dequeue();
            curr=curr.next;
        }
    }

    // public int[] printAll() {
    //     QueueNode curr = front;
    //     int[] arr = new int[this.size()];
    //     int i=0;
    //     while (i<this.size()) {
    //         arr[i++]=curr.getValue();
    //         curr=curr.getNext();
    //     }
    //     return arr;
    // }
    // public static void main (String[] args) {
    //     Queue s = new QueueRefBased();
    //     s.enqueue(1);
    //     s.enqueue(2);
    //     s.enqueue(3);
    //     s.enqueue(4);
    //     s.enqueue(5);
    //     s.enqueue(6);
    //     // s.dequeue();
    //     // System.out.println("QueueSizeNow:"+s.size());
    //     s.makeEmpty();
    //     System.out.println("\nQueueArray: "+Arrays.toString(s.printAll()));
    //     System.out.println("Is the Queue empty? Answer: "+s.isEmpty());
    //     System.out.println("Peek? "+s.peek());
    //     System.out.println("QueueSize: "+s.size());
    // }
}
