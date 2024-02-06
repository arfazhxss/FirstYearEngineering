public class B extends A implements Comparable<A> {
    public B() {
        System.out.println("B constructor 1");
    }
    public B (int x) {
        super(x);
        System.out.println("B constructor 2");
    }
    public void otherStuff() {
        System.out.println("B's other stuff: "+x);
    }
    public int compareTo(A x) {
        return this.compareTo(x);
    }
}