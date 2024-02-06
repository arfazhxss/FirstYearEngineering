import javax.swing.plaf.synth.SynthScrollBarUI;

class A {
    int x;
    public A() {
        System.out.println("A constructor 1");
    }    
    public A (int x) {
        this.x = x;
        System.out.println("A constructor 2");
    }
    public void doStuff() {
        System.out.println("A's stuff: "+x);
    }
}