public class woneqtwo {
    public static void varprac() {
        System.out.println("\nQuestion 1");
        int x = 3;
        int y = 5;
        double z = 2.7;
        System.out.println("x: "+x);
        System.out.println("z: "+z);
        System.out.println("x/y: "+x/y);
        System.out.println("x/z: "+x/z);
        System.out.println("x*z: "+x*y);
        System.out.println("x*z: "+x*z);
        System.out.println("x+y: "+x + y);

        System.out.println("\nQuestion 2");
        double d;
        d=x;
        System.out.println("d: "+d);
        d = z;
        System.out.println("d: "+d);
        d=x+y*z;
        System.out.println("d: "+d);
        d=x*y+z;
        System.out.println("d: "+d);

        System.out.println("\nQuestion 3:Compilation Error");
        //int i;
        //i=z;
        //System.out.println("i: "+i);

        System.out.println("\nQuestion 4");
        int total = 10;
        int count = 3;
        double average;

        average = (total/count);
        System.out.println("\naverage: "+average);

        System.out.println("\nQuestion 5");
        int m=4;
        m+=11;
        System.out.println("m: "+m);
        m/=2;
        System.out.println("m: "+m);

        System.out.println("\nQuestion 6");
        m=4;
        m++;
        System.out.println("m: "+m);
        ++m;
        System.out.println("m: "+m);
        m--;
        System.out.println("m: "+m);
        --m;
        System.out.println("m: "+m);
        
        System.out.println("\nQuestion 7");
        m=5;
        System.out.println("m: "+m++);
        System.out.println("m: "+m);

        System.out.println("m: "+ ++m);
        System.out.println("m: "+m);

        System.out.println("\nQuestion 8");
        int n;
        n=3;
        m=5;
        n*=m++;
        n=n*m++;
        n=n*m;
        m++;
        System.out.println("m: "+m+",n: "+n);

        n=3;
        m=5;
        n*=++m;
        m++;
        n=n*m;
        System.out.println("m: "+m+",n: "+n);



    }


    public static void main (String[] args) {
    varprac();
    }
}


